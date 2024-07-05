// Approach -> check for an empty space if a[i] == 0 //  empty
// then chcek for the prev and next val
// if they are 0 then u can plant a flower => make it as 1 and increment the count

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  // upto how many places u can plant
        int end = flowerbed.length;
        for(int i=0;i<end;i++)
        {
            if(flowerbed[i] == 0)
            {
            int prev = (i == 0 || flowerbed[i-1] == 0) ? 0 : 1;
            int next = (i == end-1 || flowerbed[i+1] == 0) ? 0 : 1;
            if(prev == 0 && next == 0)
            {
                flowerbed[i] = 1;
                count++;
            }
            }
        }
        return count >= n;   // only return trye if u have available spaces to plant
    }
}