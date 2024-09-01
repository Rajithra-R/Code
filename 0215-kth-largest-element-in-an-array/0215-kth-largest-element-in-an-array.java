// use a priority queue of integers and treat each integer as a priority and
//  hence they will be added in the form of ascending order
// add ech number into the queue and check if adding that number make the size > k
// if size of priority queue is > k then poll it out
// finally return the top element
// eg : nums = [3,2,1,5,6,4], k = 2
// p = [3] ; p = [2,3] ; p = [1,2,3] -> size > k =>p = [2,3] ; p=[2,3,5] -> size > k => p=[3,5]
// p = [3,5,6] -> size > k => p = [5,6] ; p=[4,5,6] -> size > k => p =[5,6] => top element  = 5
// o/p = 5

class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i : nums)
        {
            p.add(i);
            if(p.size() > k)
            {
                p.poll();
            }
        }
        return p.peek();*/
        Arrays.sort(nums);
       int c = nums[nums.length - k];
        return c;
    }
}