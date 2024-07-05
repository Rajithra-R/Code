class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int start = 0;
        int end = n - 1;
        SimpleMerge(nums,temp,start,end);
        return nums;
    }
    public static void SimpleMerge(int[] nums,int[] temp,int start,int end)
    {
        int size = end - start + 1;
        if(size <= 1)
        {
            return;
        }
        int mid = start + (size/2) - 1;
        SimpleMerge(nums,temp,start,mid);
        SimpleMerge(nums,temp,mid+1,end);
        TwoWayMerge(nums,temp,start,mid+1,end);
    }
    public static void TwoWayMerge(int[] nums,int[] temp,int first,int sec,int third)
    {
        int i = first;
        int j = sec;
        int l = 0;
        while(i < sec && j <= third)
        {
            if(nums[i] < nums[j])
            {
                temp[l] = nums[i];
                l++;
                i++;
            }
            else
            {
                temp[l] = nums[j];
                l++;
                j++;
            }
        }
        if(i >= sec)
        {
         while(j <= third)
        {
            temp[l] = nums[j];
            j++;
            l++;
        }
        }
        else
        {
        while(i < sec)
        {
            temp[l] = nums[i];
            i++;
            l++;
        }
        }
        for(int k=0;k<l;k++)
        {
            nums[first+k] = temp[k];
        }
    }
}