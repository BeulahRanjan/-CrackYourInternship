// Question 01-Subarray Sum Equals K
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.




import java.util.*;
public class Question01 {
    public int subarraySum(int[] a, int k) {
         int sum=0,result=0;
        Map<Integer,Integer>preSum=new HashMap<>();

        preSum.put(0,1);
        for(int i=0; i<a.length;i++){
            sum+=a[i];
            if(preSum.containsKey(sum-k)){
                result+=preSum.get(sum-k);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0)+1);
        }
        return result;
    }
}