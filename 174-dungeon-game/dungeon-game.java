class Solution {
    int n;
    int m;
    int dp[][];
    public boolean survive(int i , int j , int mid, int arr[][]){
        if(i >= n || j>= m){
            return false;
        }
        
        mid = mid+arr[i][j];
        
        if(mid <= 0){
        return false;
       }
       if(dp[i][j] >= mid){
        return false;
        
       }
       dp[i][j] = mid;


        if(i == n-1 && j == m-1){
            return true;
        }
        boolean  rgh = survive(i , j+1 , mid, arr);
        boolean bottom = survive(i+1 , j , mid , arr);

        return rgh || bottom;

    }
    public int calculateMinimumHP(int[][] arr ){
        n = arr.length;
        m = arr[0].length;

        int left = 1;
        int right = 4*10000000;
        int min =  4*10000000;
       
        while(left <= right){
            
            dp =  new int[n][m];
            int mid = left + (right- left) / 2;
            if(survive(0,0,mid,arr)){
                 
                min = mid;
                right = mid-1;
                
            }else{
                left = mid+1;
            }

        }
        return min;


        
    }
}