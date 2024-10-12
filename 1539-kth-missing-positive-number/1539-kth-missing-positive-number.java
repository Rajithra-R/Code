/* BRUTE FORCE
approach is that take an array => [2,3,4,7,11] and k = 5
keep a pointer i = 0 =>  check if arr[i] < k then move i and increment k
once arr[i] > k then return k
*/
/* BINARY SEARCH
initaially find out the number of missing number at each index
say => [2,3,4,7,11] => n = 5 so actually the array without missing number with n = 5 => [1,2,3,4,5]
sub the original array without missing from with missing => [1,1,1,3,6] 
array without missing => (index + 1) from 0 to n
=> this is the actual missing numbers at each index => apply BS so that to find the range
=> finally after binary search - high and low will be at the start and end range respectively
take the high point subtract it from k and add with the original array at that index
say =>
high = 3 => in the array => 7
low = 4 => in the array => 11
k=5
=> j = k-missing at high(3) -> j = 2  => final missing = arr[high] - high - 1
=> arr[high] = 7 + j = 9 <- answer
answer = arr[high] + j => arr[high] + k - (arr[high] - high - 1)
         answer  => arr[high] + k - arr[high] + high + 1
         answer  => k + high + 1 or k + low 
         
*/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k)
            {
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }
        }
        return low + k;
    
    }
}