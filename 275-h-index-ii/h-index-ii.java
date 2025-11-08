class Solution {
    public int hIndex(int[] c) {
                
        int start = 0;
        int end  = c.length-1;
        int n = c.length;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(c[mid]>=n-mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return n-start;
        
    }
}