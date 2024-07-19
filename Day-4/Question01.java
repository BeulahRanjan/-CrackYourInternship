// Question 01-Find the Duplicate Number
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.



import java.util.*;
public class Question01 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                x=nums[i];
                break;
            }
        }
        return x;
    }
}