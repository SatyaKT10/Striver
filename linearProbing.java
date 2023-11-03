// Sample Input 2:
// 2
// 6
// 4 7 8 1 2 5
// 3
// 6 7 10
// Sample Output 2:
// 5 7 8 1 4 2
// 6 7 10


import java.util.* ;
import java.io.*; 
import java.util.List;

public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        int size = keys.size();
        int[] ans = new int[size];

        // for (int i = 0; i < size; i++) {
        //     ans[i] = -1;
        // }
        Arrays.fill(ans,-1);

        for (int key : keys) {
            int index = key % size;
            while (ans[index] != -1) {
                index = (index + 1) % size;
            }
            ans[index] = key;
        }

        return ans;
    }


}
