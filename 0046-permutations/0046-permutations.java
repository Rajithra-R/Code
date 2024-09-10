class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int map[] = new int[n];
        permute_all(list,map,res,n,nums);
        return res;
    }
    public void permute_all(List<Integer> list , int map[] , List<List<Integer>> res ,int n,int[] nums)
    {
        if(list.size() == n)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<n;i++)
        {
            if(map[i] == 0) // unmarked
            {
                list.add(nums[i]);
                map[i] = 1;
                permute_all(list,map,res,n,nums);
                list.remove(list.size()-1);
                map[i] = 0;
            }
        }
    }
}