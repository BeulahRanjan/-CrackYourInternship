// Maximum Points You Can Obtain from Cards
// There are several cards arranged in a row, and each card has an associated number of points. The points are 
// given in the integer array cardPoints.
// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly 
// k cards.
// Your score is the sum of the points of the cards you have taken.
// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.



public class Question07 {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int st = len - k;
        int end = st;
        int sum = 0;
        int res = 0;
        for(int i = 0; i < k * 2; i++){
            sum += cardPoints[end % len];
            if(i >= k - 1){
                res = Math.max(res, sum);
                sum -= cardPoints[st % len];
                st++;
            }
            end++;
        }
        return res;
    }
}