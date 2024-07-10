class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int res[] = new int[arr1.length];
        int k = 0;
        for(int i=0;i<arr2.length;i++) // traverse through the sec array
        {
            int temp = arr2[i]; // get the ele in a variable
            for(int j=0;j<arr1.length;j++) // traverse through the first array and check if the ele in temp is present in arr1 then add it to the o/p array
            {
                if(temp == arr1[j])
                {
                    res[k] = temp;
                    k++;
                }
            }
        }
        // to add the remaining elements in sorted oredr use an arraylist
        // traverse through the 1st array and get a element in temp and check with 2nd array 
        // if present make b to 1 and break
        // if b=0 i.e till now the ele is not found...and hence add it to the array list
        // sort the list
        // then add it to o/p array
        int b = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) 
        {
            int temp = arr1[i]; 
            for(int j=0;j<arr2.length;j++) 
            {
                if(temp == arr2[j])
                {
                    b = 1;
                    break;
                }
            }
             if(b == 0)
                {
                    a.add(temp);
                }
                b = 0;
        }
            Collections.sort(a);
            for(int i=0;i<a.size();i++)
            {
                res[k] = a.get(i);
                k++;
            }
            return res;
    }
}