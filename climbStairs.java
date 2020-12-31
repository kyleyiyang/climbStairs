class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[45];
        return steps(n,arr);
    }
    public int steps(int n,int[] arr) {
        if (n==1) return 1;
        if (n==2) return 2;
        if (arr[n-1]>0) return arr[n-1];
        else {
            arr[n-1] = steps(n-1,arr)+steps(n-2,arr);
        }
        return arr[n-1];
    }
}
