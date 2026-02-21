class Solution {
    public boolean countprime(int cnt){
        int cntcheck = 0;
        for(int i = 1; i<=cnt; i++){
            if(cnt%i == 0){
                cntcheck++;
            }

        }
        if(cntcheck == 2){
            return true;
        }
        return false;

    }
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
    
        for(int i = left; i<=right; i++){
            int cntt = Integer.bitCount(i);
            if(countprime(cntt)){
                cnt = cnt+1;
            }

        }
        return cnt;
    }
}