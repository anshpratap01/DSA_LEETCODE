class Solution {
    public long removeZeros(long n) {
        StringBuilder sb = new StringBuilder();
        long ans = 0;

       String str = Long.toString(n);
       for(int i = 0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch != '0'){
            long num = ch - '0';
            ans = ans*10+num;

        }
       }
       return ans;

        
    }
}