class Solution {
    public int firstStableIndex(int[] a, int k) {
        int n = a.length;
        int arr[] = new  int[n];
        int arr2[] = new int[n];
        arr[0] = a[0];
        arr2[n-1] = a[n-1];
        for(int i = 1; i<n; i++){
            arr[i] = Math.max(arr[i-1] , a[i]);
           // arr2[n-1] = a[n-1];
        }
        for(int i = n-2; i>=0; i--){
            arr2[i]  =  Math.min(arr2[i+1] , a[i]);
            
        }
        for(int i =0; i<n; i++){
            if(arr[i] - arr2[i] <=k) return i;
        }
        return -1;
        
    }
}