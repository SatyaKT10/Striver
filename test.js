const Client = require('ssh2-sftp-client');
const fs = require('fs');
const parse = require('csv-parse/lib/sync');

const sftp = new Client();

// SFTP server connection details
const sftpConfig = {
  host: 'your_sftp_host',
  port: 22,
  username: 'your_sftp_username',
  password: 'your_sftp_password',
};

// Remote path to the CSV file on the SFTP server
const remoteCsvPath = '/path/to/your/file.csv';

// Local path to save the downloaded CSV file
const localCsvPath = 'localfile.csv';

sftp.connect(sftpConfig)
  .then(() => {
    return sftp.get(remoteCsvPath, localCsvPath);
  })
  .then(() => {
    // Read the downloaded CSV file
    const csvData = fs.readFileSync(localCsvPath, 'utf-8');

    // Parse CSV data into an array of objects
    const records = parse(csvData, {
      columns: true,
      skip_empty_lines: true,
    });

    // Convert the data to JSON
    const jsonData = JSON.stringify(records);

    // Close the SFTP connection
    sftp.end();

    // Use the JSON data as needed
    console.log(jsonData);

    // Optionally, delete the local CSV file
    fs.unlinkSync(localCsvPath);
  })
  .catch((err) => {
    console.error('Error:', err.message);
  });
