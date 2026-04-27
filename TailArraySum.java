class GfG {
    
    static int arrSum(int[] arr, int n, int sum) {
        if (n == 0)
            return sum;
        
        return arrSum(arr, n - 1, sum + arr[n - 1]);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 55, 1, 7 };
        int n = arr.length;
        System.out.print(arrSum(arr, n, 0)); 
    }
}
