class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      //  int k = 2;
        int arr[] = nums;
        int n = arr.length;
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        get(0,arr,cur,res,n);
      /*  for(List<Integer> i : res)
        {
             System.out.println(i);
        }*/
        return res;
    }
    public static void get(int ind,int[] arr,List<Integer> cur,List<List<Integer>> res,int n)
    {
        if(ind == n) 
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[ind]);
        get(ind+1,arr,cur,res,n);
        cur.remove(cur.size()-1);
        get(ind+1,arr,cur,res,n);

    }
}