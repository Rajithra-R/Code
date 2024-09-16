// set 2 var to increment opencount and closecount whenevr u encounter a (  or  )
// once both the count are equal then which means there is a matching pair , it can be an outer / inner parentheses
// anyway return the string inside to it using a substring function
// if it is a outer parentheses - it will return the inner parenthese
// if it is inner then it will return empty..
// eg : (()()) => (- open =1 ; (- open =2 ; ) - close = 1;(- open =3; )- close=2 ; )- close = 3
// open == close =>start = 0 -> start + 1 ; i=5; // end is exclusive // return (1,5)
// ()() <- o/p

class Solution {
    public String removeOuterParentheses(String s) {
        int opencount = 0;
        int closecount = 0;
        int start = 0;
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                opencount++;
            }
            else if( c == ')')
            {
                closecount++;
            }
            if(opencount == closecount)  // means we have find a matching pair
            // hence return the substring that is inside this parentheses
            {
                res += s.substring(start+1,i);
                start = i+1; // start from the next set;
            }
        }
        return res;
    }
}