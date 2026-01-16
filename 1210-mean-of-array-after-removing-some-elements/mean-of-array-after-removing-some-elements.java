class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int  d = n*5/100;
        int  sum = 0;

        for(int i= d; i<n-d; i++){
            sum = sum+arr[i];
        }
        double ans = (double)sum/(n-2*d);
        return ans;
        
    }
}