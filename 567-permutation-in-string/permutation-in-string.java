class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;

        
        StringBuilder sb = new StringBuilder();

 
        for( int right = 0; right<s2.length(); right++){
            sb.append(s2.charAt(right));

            if(right - left+1 == s1.length()){
             HashMap<Character , Integer> mp = new HashMap<>();

                for(int i = 0; i<s1.length(); i++){
                    char ch = s1.charAt(i);
                    mp.put(ch , 1+mp.getOrDefault(ch , 0));
                }

                boolean flag = true;

                for(int i = 0; i<sb.length(); i++){
                    char c = sb.charAt(i);
                    if(!mp.containsKey(c) || mp.get(c)==0){
                        flag = false;
                        break;
                    }

                    mp.put(c,mp.get(c)-1);

                    
                    
                }
                if(flag){
                 return true;
                }

                sb.deleteCharAt(0);
                left++;





            }
           




        }
        return false;
        
    }
}