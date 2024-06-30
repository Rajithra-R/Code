class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++) // the array should have atleast 3 numbers so n-2
        {
            int a = nums[i];
            int l = i+1;
            int r = n-1;
            while(l < r)
            {
                int b = nums[l];
                int c = nums[r];
                int sum = a + b + c;
                if(sum == 0)
                {
                    List<Integer> t = Arrays.asList(a,b,c);
                    s.add(t);
                    l++;
                    r--;
                }
                else if(sum < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        res.addAll(s);
        return res;
    }
}