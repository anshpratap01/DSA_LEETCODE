class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int cnt1 = 0;
        int i = 0;
        int n = s.length();

        while(i<n){
            if(s.charAt(i) == '0'){
                res += cnt1;
                while( i<n && s.charAt(i) == '0'){
                    i++;
                }
            }
            else{
                cnt1++;
                 i++;
               

            }
         

        }
        return res;
        
    }
}