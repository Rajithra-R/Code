/* 
here we are taking the subarrays with length <= k into the account assuming that it may be a possible answer
only if the map size <= k incremanrt the cnt
if size > k then decreament the cnt and if it is = 0 then take off left.
*/

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // Subarrays with exactly k distinct = Subarrays with at most k distinct - Subarrays with at most k-1 distinct
        
        return subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k - 1);  
    }
     public int subarraysWithAtMostKDistinct(int[] nums, int k) {
     int left = 0;
        int cnt = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int right = 0;right < nums.length;right++)
        {
            h.put(nums[right],h.getOrDefault(nums[right] , 0) + 1);
            
            while(h.size() > k)
            {
                h.put(nums[left],h.get(nums[left]) -1);
                if(h.get(nums[left]) == 0)
                {
                    h.remove(nums[left]);
                }
                left++;
            }
            cnt += right - left + 1;
        }
        return cnt;
     }
}