// Question 06-4Sum
// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], 
// nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.



import java.util.*;

public class Question06 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>(); 
        
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[left]);
                        arr.add(nums[right]);
                        
                        if (!resultSet.contains(arr)) {
                            resultSet.add(arr); 
                        }
                        
                        left++;
                        right--;
                    } else if (sum <= target) {
                        left++;
                    } else if(sum > target){
                        right--;
                    }
                }
            }
        }
        
        result.addAll(resultSet); 
        
        return result;
    }
}