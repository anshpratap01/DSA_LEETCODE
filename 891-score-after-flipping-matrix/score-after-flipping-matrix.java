class Solution {
    public int matrixScore(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
       // first coloumn ko 1  bna do aur uske correspons=dence row ko
        for(int i = 0; i<n; i++){
            if(arr[i][0] ==0){
                for(int j = 0; j<m; j++){
                    arr[i][j] = arr[i][j] ^ 1;
                }
            }
        }

        // har row ke zerors ko count kro agr zeroes zayada hai toh uss coloumn ko flip kar do

    for(int j = 1; j<m; j++){
        int zero  = 0;
        int ones = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i][j] == 0) zero++;
            else ones++;
        }
        if(zero > ones){
            for(int  i = 0; i<n; i++){
                arr[i][j] = arr[i][j] ^ 1;

            }

        }
    }
    int sum = 0;
    int pow = 1;

    // now compute all the powers of all the coloums 
    for(int j = m-1; j>=0; j--){
        int ones = 0;
        for(int  i=0; i<n; i++){
            if(arr[i][j] == 1) ones++;
        }
        sum += (pow*ones);
        pow = pow*2;
        
     
    }
    return sum;


        
    }
}