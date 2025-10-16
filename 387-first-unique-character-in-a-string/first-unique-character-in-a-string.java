class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        int n = s.length();

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            mp.put(ch,1+ mp.getOrDefault(ch,0));

        }
       
         for (int i = 0; i < n; i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i; 
            }
        }
        return -1;
        
    }
}