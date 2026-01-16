import java.util.*;

public class LeetCode_0001_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result;

        Solution s = new Solution();
        
        result = s.twoSum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
    }
}

// Solution 1 O(n^2)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // System.out.println("Target: " + target);
//         // System.out.println("Array: " + Arrays.toString(nums));
        
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] {i, j};
//                 } 
//             }
//         } 
//         return new int[] {}; 
//     }
// }

// Solution 2 O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {}; 
    }
}