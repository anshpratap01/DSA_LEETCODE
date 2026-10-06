class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<String> sh = new Stack<>();
        int num = 0;
        String curs = "";

        for(int i = 0; i<s.length(); i++){
            
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else if(ch == '['){
                st.push(num);
                sh.push(curs);

                num = 0;
                curs="";
            }else if(ch == ']'){
                int repeat = st.pop();
                String prev = sh.pop();
                StringBuilder sb = new StringBuilder(prev);

                for(int j = 0; j<repeat; j++){
                    sb.append(curs);
                }

                curs = sb.toString();
            }else{
                curs = curs+ch;
            }
        }
        return curs;
        
    }
}