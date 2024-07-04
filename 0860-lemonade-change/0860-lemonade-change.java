class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i] == 5) 
            {
                five += 1;
            }
            else if (bills[i] == 10)  // we need atleast one 5 to return 
            {
                if(five == 0)  // no 5
                {
                    return false;
                }
                else
                {
                    five -= 1;
                    ten += 1;
                }
            }
            else
            {
                if(ten > 0 && five > 0)   // this line takes prior than next because 10 is greater
                {
                    ten -= 1;
                    five -= 1;
                    twenty++;
                }
                else if(five >= 3)
                {
                    five -= 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}