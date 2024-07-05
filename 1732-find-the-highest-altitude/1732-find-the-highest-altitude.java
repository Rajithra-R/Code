class Solution {
    public int largestAltitude(int[] gain) {
        int i=0;
        int j=0;
        int sum = 0;
        int max = 0;
        while(i < gain.length)
        {
            sum += gain[i];
            i++;
            max = Math.max(max,sum);
        }
        return max;
    }
}