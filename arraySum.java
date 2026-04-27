// User function Template for Java

class Solution {
    int arraySum(int arr[]) {

        return sum(arr.length , arr);
        
    }
    int sum(int n , int[] arr)
    {
        if(n==0) return 0;
        return arr[n-1] + sum(n-1 , arr);
    }
}
