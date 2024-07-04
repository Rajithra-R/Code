class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int totalLength = n1 + n2;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;

        for (int k = 0; k <= totalLength / 2; k++) {
            m1 = m2;

            if (i != n1 && (j == n2 || nums1[i] < nums2[j])) {
                m2 = nums1[i];
                i++;
            } else {  // i == n1 || nums2[j] < nums1[i]
                m2 = nums2[j];
                j++;
            }
        }

        if (totalLength % 2 == 0) {
            return (m1 + m2) / 2.0;
        } else {
            return m2;
        }
    }
}