class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int max = 0;
        int left = 0;
        int maxfreq = 0;
        for(int right = 0; right<s.length();right++){
            char c = s.charAt(right);
            mp.put(c,1+ mp.getOrDefault(c,0));
            maxfreq = Math.max(maxfreq,mp.get(c));
            int letter = (right-left+1) - maxfreq;
            if(letter>k){
                char leftchar = s.charAt(left);
                mp.put(leftchar,mp.get(leftchar)-1);
                left++;
            }
            max = Math.max(right-left+1,max);

            

        }
        return max;

        
    }
}