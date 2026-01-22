class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int arr[] = new int[n];
        int xor = 0;
        for(int i = n-1; i>0; i--){
            xor = (pref[i] ^pref[i-1]);
            arr[i] = xor;
            
        }
        arr[0] = pref[0];
        return arr;
        
    }
}