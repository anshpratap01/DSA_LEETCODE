class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            if(st.size()>0 && st.peek() != s.charAt(i)){
                st.pop();
            }
            else if(st.size()== 0) st.push(s.charAt(i));
            else if( st.peek() == s.charAt(i)){
                st.push(s.charAt(i));
            }
        }
        return st.size();
        
    }
}