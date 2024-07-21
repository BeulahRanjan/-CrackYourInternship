// Question 06-Product array puzzle
// Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the 
// product of all the elements of nums except nums[i].




class Question06
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
       
        long[] arr= new long[nums.length];
        
           
        for(int i=0;i<n;i++){
            long pro = 1;
            for(int j=0;j<n;j++){
                if(i != j) 
                pro*=nums[j];
            }
            arr[i] = pro;
        }
        return arr;
	} 
} 

