class Solution {
    
    public String reverseWords(String s) {
        
        String[] st = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        String  v = st[0];
        sb.append(st[0]);
        if(st.length != 1){
        sb.append(" ");
        }
        int count = 0;
        for(int i = 0; i<v.length(); i++){
            char ch = v.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u' ){
                count++;
            }
        }
        
        for(int i = 1; i<st.length; i++){
            String check = st[i];
            int cnt = 0;
            for(int j = 0; j<check.length();j++){
                char chh = check.charAt(j); 
                if(chh == 'a'|| chh == 'e' || chh == 'i'|| chh == 'o'|| chh == 'u' ){
                cnt++;
            }
            }
            if(cnt == count){
               String reverse = new StringBuilder(check).reverse().toString();
               sb.append(reverse);
               if(i != st.length-1){
                    sb.append(" ");
                }
            }else{
                sb.append(check);
                if(i != st.length-1){
                    sb.append(" ");
                }
                
                
            }
        }
       return  sb.toString();

        
    }
}