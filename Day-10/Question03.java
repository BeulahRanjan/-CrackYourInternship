// Question 03-Chocolate Distribution Problem
// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a 
// packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute 
// chocolate packets among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates 
// given to a student is minimum



import java.util.*;
public class Question03
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
                long res = Long.MAX_VALUE;
        Collections.sort(a);
        for(int i =0; i<n-m+1; i++){
            int minele = a.get(i);
            int maxele = a.get(i+m-1);
            res = (long)Math.min(res, maxele-minele);
        }
        return res; 
    }
}