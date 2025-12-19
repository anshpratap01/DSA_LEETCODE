class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<String , Integer> st = new HashMap<>();

        while(j<s.length()){
            char ch = s.charAt(j);
            mp.put(ch,1+mp.getOrDefault(ch,0));

            if(j-i+1 == minSize){
                if(mp.size() <= maxLetters){
                    String sub = s.substring(i,j+1);
                    st.put(sub,1+st.getOrDefault(sub,0));
                    max = Math.max(st.get(sub), max);


                }
                char left = s.charAt(i);
                mp.put(left,mp.get(left)-1);
                    if(mp.get(left) == 0){
                        mp.remove(left);
                        
                    
                }
                i++;
            }
            j++;

        }
        return max;
        
    }
}