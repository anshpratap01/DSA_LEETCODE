class Solution {
    public boolean checkInclusion(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(j<s2.length()){
            sb.append(s2.charAt(j));
            if(j-i+1<s1.length()){
                j++;
            }else if(j-i+1 == s1.length()){
                HashMap<Character, Integer> map = new HashMap<>();

                // frequency of p
                for (int k = 0; k < s1.length(); k++) {
                    char c = s1.charAt(k);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }

                boolean flag = true;

                // check window
                for (int l = 0; l < sb.length(); l++) {
                    char c = sb.charAt(l);
                    if (!map.containsKey(c) || map.get(c) == 0) {
                        flag = false;
                        break;
                    }
                    map.put(c, map.get(c) - 1);
                }

                if (flag) {
                    return true;
                }

                sb.deleteCharAt(0);
                i++;
                j++;
            }
            }
            return false;
            

        }
       
        
    }
