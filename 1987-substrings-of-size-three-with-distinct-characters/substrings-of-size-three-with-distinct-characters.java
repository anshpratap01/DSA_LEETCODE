class Solution {
    public int countGoodSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        int j = 0;
        int cnt = 0;
        while(j<s.length()){
            
            sb.append(s.charAt(j));

            if(j-i+1 < 3){
                j++;
            }else if(j-i+1 == 3){
                HashSet<Character> st = new HashSet<>();
                for(int k = 0; k<sb.length(); k++){
                    st.add(sb.charAt(k));
                }
                if(st.size() == sb.length()){
                    cnt++;
                }
                sb.deleteCharAt(0);
                i++;
                j++;
            }



            

        }
        return cnt;
        
    }
}