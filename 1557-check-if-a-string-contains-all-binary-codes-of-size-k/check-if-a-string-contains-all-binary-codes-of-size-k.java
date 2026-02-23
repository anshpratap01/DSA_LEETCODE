class Solution {
    public boolean hasAllCodes(String s, int k) {
        int  size = 1<<k;

        HashSet<String> st = new HashSet<>();
        for(int i = 0; i<=s.length() - k ; i++){
            String sub = s.substring(i,i+k);
            st.add(sub);
        }

        if(st.size() == size){
            return true;
        }
        return false;

        
    }
}