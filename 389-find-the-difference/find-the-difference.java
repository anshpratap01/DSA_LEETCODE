class Solution {
    public char findTheDifference(String s, String t) {
        int xor1 = 0;
        for(int i = 0; i<t.length(); i++){
            xor1 = xor1^(t.charAt(i));

        }
        
        for(int i = 0; i<s.length(); i++){
            xor1 = xor1^(s.charAt(i));

        }

        return (char)xor1;


        
    }
}