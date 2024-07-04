class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = StartRange(nums,target);
        res[1] = EndRange(nums,target);
        return res;
    }
    private int StartRange(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low <= high)
        {
        int mid = (low + high) / 2;
        if(nums[mid] == target)
        {
            //it would be the start range 
            //hence move the end value (high) to the left
            index = mid; // because in the nxt step itself we need mid...if mid is returned then the nxt stmt becomes unreachable
            high = mid - 1;
        }
        else if(nums[mid] < target)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
        }
        return index;
    }
    private int EndRange(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low <= high)
        {
        int mid = (low + high) / 2;
        if(nums[mid] == target)
        {
            //it would be the last range 
            //hence move the start value (low) to the right
            index =  mid;
            low = mid + 1;
        }
        else if(nums[mid] < target)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
        }
        return index;
    }
    
}