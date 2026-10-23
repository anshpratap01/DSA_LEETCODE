class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < s.length() ; right++){
            char ch = s.charAt(right);
            
            while(st.contains(ch)){
                st.remove(s.charAt(left));
                left++;
            }
             st.add(ch);

            if(st.size() == right-left+1){
                max = Math.max(max , right-left+1);
            }
           
        }
        return max;
        
    }
}