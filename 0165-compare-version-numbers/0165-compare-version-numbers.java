class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int m = v1.length;
        int n = v2.length;
        int i = 0,j = 0;
        while(i < m || j < n)
        {
            int a = i < m ? Integer.parseInt(v1[i]) : 0;
            int b = j < n ? Integer.parseInt(v2[j]) : 0;
            if(a != b)
            {
                return a < b ? -1 : 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}