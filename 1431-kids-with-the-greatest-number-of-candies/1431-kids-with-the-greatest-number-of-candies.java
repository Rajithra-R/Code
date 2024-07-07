
// the logic is that initially get the max value from the entire array
// them add the extracandy with each ele in tha array and compare if it is grater than the max value
// if greater then add true to the arraylist else add false;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int n = candies.length;
        //find the maximum number
        int max = candies[0];
        for(int i=0;i<n;i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        // update the arraylist
        for(int i=0;i<n;i++)
        {
            int sum = candies[i] + extraCandies;
            if(sum >= max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;
    }
}