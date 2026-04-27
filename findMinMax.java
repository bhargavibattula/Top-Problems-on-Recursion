class Solution {

    int findMin(int[] arr, int i) {
        
        if(i == arr.length - 1) return arr[i];

        int smallAns = findMin(arr, i + 1);

        return Math.min(arr[i], smallAns);
    }

    int findMax(int[] arr, int i) {
        
        if(i == arr.length - 1) return arr[i];

        int smallAns = findMax(arr, i + 1);

        return Math.max(arr[i], smallAns);
    }
}
