class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int max_len = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(right = 0;right < fruits.length;right++)
        {
            // add each friut into the hash(basket)
            h.put(fruits[right],h.getOrDefault(fruits[right],0)+1);
            //check if the basket has more than 2 elements
            // if so get its count and decrement it if count is 1 then remove the ele from the basket and then slide the window
            while(h.size() > 2)
            {
                int count = h.get(fruits[left]);
                if(count == 1)
                {
                    h.remove(fruits[left]);
                }
                else
                {
                    h.put(fruits[left],count - 1);
                }
                left++;
            }
            max_len = Math.max(max_len,right- left + 1);
        }
        return max_len;
    }
}