class Solution {

    public boolean ans(HashMap<Character, Integer> mp) {
        int mini = Integer.MAX_VALUE, maxi = 0;
        for (int val : mp.values()) {
            mini = Math.min(mini, val);
            maxi = Math.max(maxi, val);
        }
        return mini == maxi;
    }
    public int longestBalanced(String s) {
        int ans2 =0;
        for(int i = 0; i<s.length();i++){
             HashMap<Character,Integer> mp = new HashMap<>();
             for(int j = i; j<s.length(); j++){
             char ch = s.charAt(j);
             mp.put(ch,1+mp.getOrDefault(ch,0));
             if(ans(mp)){
                int length = j-i+1;
                ans2 = Math.max(ans2,length);
             }
             }
        }
        return ans2;
   
        
    }
}