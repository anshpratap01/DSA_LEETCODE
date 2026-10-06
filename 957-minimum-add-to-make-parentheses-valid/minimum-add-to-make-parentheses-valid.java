class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<>();

        int cnt = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(ch);
            }else if( ch == ')'){
                if(st.size() == 0){
                    cnt++;
                }else{
                    st.pop();
                }
            }
        }

        cnt+=st.size();
        return cnt;
        
    }
}