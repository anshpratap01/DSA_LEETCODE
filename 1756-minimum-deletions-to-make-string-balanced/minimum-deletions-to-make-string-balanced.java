class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        int del = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                count++;
            }else{
                del = Math.min(del+1 , count);
            }
        }
        return del;
        
    }
}