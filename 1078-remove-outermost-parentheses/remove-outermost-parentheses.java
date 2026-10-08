class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String sh  = ""; 

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(st.size() != 0){
                   sh+= ch;
                }
                st.push(ch);

            }else{
                st.pop();
                if(st.size() != 0){
                    sh+=ch;
                }
            }
        }
        return sh;
        
    }
}