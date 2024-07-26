// Question 05-Subarray Sums Divisible by K
// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible 
// by k.
// A subarray is a contiguous part of an array.



import java.util.*;
public class Question04 {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        int sum = 0;
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = (sum+arr[i])%k;
            
            if(sum<0) 
                sum+=k;
            
            ans += mp.getOrDefault(sum, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        
        return ans;
    }
}