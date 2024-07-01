class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
        {
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] arr = intervals[0];
        res.add(arr);
        for(int[] i : intervals)
        {
            if(i[0] <= arr[1])  // the 1st digit of a num > 2nd dig of the prev number 
            //update the 2nd digit of the interval as the max of these values
            {
                arr[1] = Math.max(arr[1],i[1]);
            }
            else
            {
                //add it as a new interval
                arr = i;
                res.add(arr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}