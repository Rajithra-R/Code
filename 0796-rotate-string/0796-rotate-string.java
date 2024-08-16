// the approach is that add s+s and get the string twice and check if the goal is present in that s+s
// eg : s= abcdeabcde  , g = cdeab- ab'cdeab'cde contains the goal so return true
// check for goal - abced it is not found so false

class Solution {
    public boolean rotateString(String s, String goal) {
         if(s.length() != goal.length())
         {
             return false;
         }
        if(s.equals(goal))
        {
            return true;
        }
        if((s+s).contains(goal))
        {
            return true;
        }
        return false;
    }
}