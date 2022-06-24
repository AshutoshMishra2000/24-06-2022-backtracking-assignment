/*

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
Output: 1 
Explanation: Here there exists a subset with
sum = 9, 4+3+2 = 9.

*/


import java.util.*;
 
class subsetSumProblem {
 
    // Recursive function to return the count
    // of subsets with sum equal to the given value
    static int subsetSum(int arr[], int n, int sum, int s,
                         int count)
    {
       
        // The recursion is stopped at N-th level
        // where all the subsets of the given array
        // have been checked
        if (n == 0) {
 
            // Incrementing the count if sum is
            // equal to the subset and returning the count
            if (sum == s) {
                count++;
            }
            return count;
        }
 
        count = subsetSum(arr, n - 1, sum, s, count);
        count = subsetSum(arr, n - 1, sum, s + arr[n - 1],
                          count);
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 10;
        int s = 0; // Initially assigning the sum of subset
                   // to be zero
        int n = arr.length;
 
        System.out.print(subsetSum(arr, n, sum, s, 0));
    }
}
