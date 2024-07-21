// Question 01-Set Matrix Zeroes
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.





import java.util.*;
class Question01 {
    public void setZeroes(int[][] matrix) {
        int[] rows=new int[matrix.length];
        int[] cols=new int[matrix[0].length];
        Arrays.fill(rows,1);
        Arrays.fill(cols,1);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rows[i]=0;
                    cols[j]=0;
                }
            }
        }
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(rows[i]==0 || cols[j]==0)
               matrix[i][j]=0;
            }
        }
        
    }
}