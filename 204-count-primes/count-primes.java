class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean [n];
        // sabko pahele prime bna do 2 --> 10 tak;

        for(int i = 2; i<n; i++){
            prime[i]  = true;
        }

        // 2 ---> sqrt(n) tk ke multiples ko non prime bna do
        for(int i= 2; i*i<n; i++){
            if(prime[i]){
            for(int j = i*i ; j<n; j+=i){
                prime[j] = false;
            }
            }
        }
        int cnt = 0;
        if(n<=2) return 0;
        for(int i = 2; i<n; i++){
            if(prime[i]){
                //System.out.print(i+" ");
                cnt++;
            }
        }
        return cnt;


        
    }
}