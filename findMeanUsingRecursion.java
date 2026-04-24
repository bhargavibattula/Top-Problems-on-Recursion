class Solution {
    public static int findMean(int[] arr) {
       return (int) helper(arr , arr.length);
    }
    
    private static double helper(int[] arr , int n )
    {
        if(n==1)
        {
            return arr[0];
        }
        
        return (helper(arr , n-1 )* (n-1) + arr[n-1])/n;
    }
};
