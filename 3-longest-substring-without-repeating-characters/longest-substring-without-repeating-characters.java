class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character , Integer > mp = new HashMap<>();

     int left= 0;
     int max = Integer.MIN_VALUE;
     if(s.length() == 0){
        return 0;
     }

     for(int right = 0; right < s.length() ; right++){

        char ch = s.charAt(right);
        mp.put(s.charAt(right) , 1+ mp.getOrDefault(s.charAt(right) , 0));

        while(mp.size() < right-left+1){
            mp.put(s.charAt(left) , mp.get(s.charAt(left))-1);
            if(mp.get(s.charAt(left)) == 0){
                mp.remove(s.charAt(left));
            }
            left++;
        }
        
        if(right- left+1 == mp.size()){
            max = Math.max(right-left+1 , max);

        } 
         //mp.put(s.charAt(right) , 1+ mp.getOrDefault(s.charAt(right) , 0));
     }
        return max;
        

        
        
    }
}