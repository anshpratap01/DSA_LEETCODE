class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        //int idx = 0;
        int mod = 26;
        String ans = "";
        for(int i = 0; i<words.length; i++){
            String s = words[i];
            int sum = 0;
            for(int j = 0; j<s.length(); j++){
                 char ch = s.charAt(j);
                int idx = ch-'a';
                sum = sum+weights[idx];
                // System.out.println(sum);
                

            }
            
            
            //System.out.println(sum);
            sum = sum%mod;
            //System.out.println(sum);
            char c = (char)('z'-sum);
            ans = ans + c;
        }
        return ans;
    }
}