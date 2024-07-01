class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for(int i=0;i<numRows;i++)
        {
            vector<int>v(i+1,1) ;
            // for the 1st row there is one element and since i=0 give i+1 indicating the size
             //by default the number is 1
            for(int j=1;j<i;j++)
            // j is enough to start from 1 as i=0,j=0 is 1 and if i=2 j's val is 0,1,2  
            {
                v[j] = res[i-1][j-1] + res[i-1][j];
            }
            res.push_back(v);
        }
        return res;
    }
};