class Solution {
    public boolean ok(int a[] , int k, int n){
        int pm = 0;
        for(int i = 0; i<n; i+=k){
            int min = a[i];
             int max = a[i];
            int c = 0;
            for(int j = i;j<i+k-1; j++){
                if(a[j+1]<min){
                    min = a[j+1];
                    
                 // }
                }
                if(a[j+1] > max){
                    max = a[j+1];
                  }
                if(a[j] > a[j+1]){
                    c++;
            }
            }
            if(c>1 || (c==1 && a[i+k-1] > a[i]) || pm>min)
                return false;
            pm = max;
            
                
        }
        return true;
    }
    public int sortableIntegers(int[] nums) {
        int n =nums.length;
        int s = 0;
        for(int k =1;k<=n; k++){
            if(n%k==0 && ok(nums,k,n)){
                s= s+k;
            }
        }
        //System.out.print(s+ " ");
        return s;
        
        
    }
}