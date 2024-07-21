// Question 04-Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
// always exists in the array.

 

import java.util.*;
class Question04 {
    public int majorityElement(int[] nums) 
    {
          int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) 
            {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}