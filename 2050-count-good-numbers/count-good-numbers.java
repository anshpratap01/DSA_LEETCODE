class Solution {
    long mod = 1000000007;
    long pow(long a,long b){
        if(b==0) return 1;
        if(b==1) return a;
        long p = pow(a,b/2);
        if((b&1)==0) return (p*p)%mod;
        else return (a*(p*p))%mod;
    }
    public int countGoodNumbers(long n) {
        long k1 = pow(5,n/2)%mod;
        long k2 = pow(4,n/2)%mod;
        long ans = (k1*k2)%mod;
        if((n&1)==0) return (int)(ans);
        else return (int)((ans*5)%mod);
    }
}