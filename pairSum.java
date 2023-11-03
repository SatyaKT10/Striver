// 3   Pair Sum

// Sample Input 1:
// 5 5
// 1 2 3 4 5
// Sample Output 1:
// 1 4
// 2 3
// Explaination For Sample Output 1:
// Here, 1 + 4 = 5
//       2 + 3 = 5
// Hence the output will be, (1,4) , (2,3).
// Sample Input 2:
// 5 0
// 2 -3 3 3 -2
// Sample Output 2:
// -3 3
// -3 3
// -2 2

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == s){
                    int[] pair = {arr[i],arr[j]};
                    result.add(pair);
                }
}
        }
        return result;
    }
}

