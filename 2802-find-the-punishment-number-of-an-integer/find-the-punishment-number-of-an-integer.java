class Solution {
    public boolean check(String s, int num,int sum){
        if( s.isEmpty() && num == sum){
            return true;
        }
        if(sum>num){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            String left = s.substring(0,i+1);
            String right = s.substring(i+1);
           int  newsum = sum + Integer.valueOf(left) ;
            if(check(right,num,newsum)){
                return true;
            }
        }
        return false;

        
    }
    public int punishmentNumber(int n) {
        int res = 0;
        for(int num = 1; num<=n; num++){
            int square = num*num;
            String s = String.valueOf(square);
            if(check(s,num,0)== true){
                res = res+square;
            }
        }
        return res;
        
    }
}