class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
     void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1 = m-l+1;
         int n2 = r-m;
         int L[] = new int[n1];
         int R[] = new int[n2];
         for(int i=0;i<n1;i++)
         {
             L[i] = arr[l+i];
         }
         for(int j=0;j<n2;j++)
         {
             R[j] = arr[m+1+j];
         }
         int i =0,j = 0 ,k = l;
         while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k++] = L[i++];
        } else {
            arr[k++] = R[j++];
        }
      }

    // Copy remaining elements of L[] if any
    while (i < n1) {
        arr[k++] = L[i++];
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
        arr[k++] = R[j++];
    }
    }
    public int mergeSort(int arr[], int l, int r)
    {
        //code here
        int c = 0;
        if(l < r)
        {
        int m = (l+r)/2;
        c += mergeSort(arr,l,m);
        c += mergeSort(arr,m+1,r);
        c += cntpairs(arr,l,m,r);
        merge(arr,l,m,r);
        }
        return c;
    }
        public int cntpairs(int[] arr,int l,int m,int r)
        {
            int h = m+1;
            int c= 0;
            for(int i=l;i<=m;i++)
            {
                while(h <= r && arr[i] > 2L * arr[h])
                {
                    h++;
                }
                c += (h - (m+1));
            }
            return c;
        }
}

