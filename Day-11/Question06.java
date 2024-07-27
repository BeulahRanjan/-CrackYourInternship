// Question 06 - Max Value of Equation
// You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, 
// where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.
// Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
// It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.





public class Question06 {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans=Integer.MIN_VALUE;
		int i=0;
        int f=1;
        while(i < points.length) {
            if(f<i+1)
                f=i+1;
            for (int j = f; j <= points.length-1; j++) {
                if(points[j][0]>(points[i][0]+k))
					break;
                if((points[i][1]+points[j][1]+points[j][0]-points[i][0])>ans){
                    ans=points[i][1]+points[j][1]+points[j][0]-points[i][0];
                    f=j-1;
                }
            }
            i++;
        }
        return ans;
    }
}