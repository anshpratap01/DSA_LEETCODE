class Solution {
    public boolean check(int idx,int currsum,String s, int num){
        if(idx == s.length()){
            return currsum == num;
        }
        if(currsum>num){
            return false;
        }
        boolean flag = false;
        for(int j = idx; j<s.length(); j++){
            String sub = s.substring(idx,j+1);
            int val = Integer.valueOf(sub);
            flag = flag || check(j+1,currsum+val,s,num);
            if(flag == true){
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
            if(check(0,0,s,num)== true){
                res = res+square;
            }
        }
        return res;
        
    }
}