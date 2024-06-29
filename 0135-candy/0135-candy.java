class Solution {
    public int candy(int[] ratings) {
        int can = 0;
        int n = ratings.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<n;i++) //traverse left
        {
            if(ratings[i] > ratings[i-1])  //if(right ele is greater then cur = prev +1 )
            {
                left[i] = left[i-1] + 1;
            }
        }
        for(int i=n-2;i>=0;i--) //traverse right from last
        {
            if(ratings[i] > ratings[i+1])  //if(left ele is greater then cur = next +1 )
            {
                right[i] = right[i+1] + 1;
            }
        }
       for(int i=0;i<n;i++)
        {
                can = can +  Math.max(left[i],right[i]);
         }
         return can;
    }
}