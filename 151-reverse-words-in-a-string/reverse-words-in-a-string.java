class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = words.length;

        for(int i = n-1; i>=0; i--){
            if(words[i].length()>0){
            sb.append(words[i]);
            sb.append(" ");
        }
        }
        return sb.substring(0,sb.length()-1).toString();
        
    }
}