//1. bubble sort

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    public void sortColors(int[] nums) {
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int value = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = value;
                }
            }
        }
        
    }
}


// solution 2 

class Solution {
public:
    void sortColors(vector<int>& nums) {
        // int zeroCount = 0;
        // int oneCount = 0;
        // int twoCount = 0;

        // for(int i: nums){
        //     if(i==0){
        //         zeroCount++;
        //     } else if(i==1){
        //         oneCount++;
        //     } else {
        //         twoCount++;
        //     }
        // }

        // int i = 0;

        // while(zeroCount > 0 || oneCount > 0 || twoCount >0){
        //     if(zeroCount > 0){
        //         nums[i] = 0;
        //         zeroCount--;
        //     } else if(oneCount > 0){
        //         nums[i] = 1;
        //         oneCount--;
        //     } else {
        //         nums[i] = 2;
        //         twoCount--;
        //     }
        //     i++;
        // }

        int i = 0;
        int j = 0;
        int k = nums.size()-1;

        while(j<=k){
            if(nums[j]==0){
                swap(nums[i], nums[j]);
                i++;
                j++;
            } else if(nums[j]==1){
                j++;
            } else {
                swap(nums[j], nums[k]);
                k--;
            }
        }
    }

    //     0<i
    //     i..j 1
    //     j .. k 012
    //     k < 2
    //   0,0,1,1,0,2,0,2,2,2
    //     i   j       k
    //     ->  ->      <-

    //     int count0 = 0;
    // int count1 = 0;
    // int count2 = 0;
    // vector<int> countNums;
    // vector<int> finalNums;

    // for (int i = 0; i < nums.size(); i++) {
    //     if (nums[i] == 0) {
    //         countNums.push_back(count0++);
    //     } else if (nums[i] == 1) {
    //         countNums.push_back(count1++);
    //     } else {
    //         countNums.push_back(count2++);
    //     }
    // }

    // for (int i = 0; i < countNums.size(); i++) {
    //     for (int j = 0; j < countNums[i]; j++) {
    //         finalNums.push_back(i);
    //     }
    // }

    // nums = finalNums;

    // }
};




