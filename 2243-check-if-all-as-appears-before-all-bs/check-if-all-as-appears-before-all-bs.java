class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int idx = 0;
        boolean flag = false;
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                idx = i;
                flag = true;
                break;

            }
        }
        if(flag == false) return true;
       // if(idx == n) return true;
        
        for(int i = idx+1 ;i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                return false;

            }
        }
        return true;

        
    }
}