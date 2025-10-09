class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    count++;

                }else{
                    st.pop();
                }
                
            }


        }
        if(!st.isEmpty()){
            while(st.size()>0){
                count++;
                st.pop();
            }
        }
        return count;
        
    }
}