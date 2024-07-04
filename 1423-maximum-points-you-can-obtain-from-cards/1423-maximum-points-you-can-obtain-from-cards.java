class Solution {
    public int maxScore(int[] cardPoints, int k) { 
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
        int max = 0;
        // initially we do sum up k elements from the front
        for(int i =0;i<k;i++)
        {
            lsum += cardPoints[i];
            max = Math.max(max,lsum);
        }
        //remove 1 from front and add 1 at the back
        int n = cardPoints.length;
        int right = n-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum -= cardPoints[i];
            rsum += cardPoints[right];
            right--;  // add further elements from the end
            sum = lsum + rsum;
            max = Math.max(max,sum);
        }
        return max;
    }
}