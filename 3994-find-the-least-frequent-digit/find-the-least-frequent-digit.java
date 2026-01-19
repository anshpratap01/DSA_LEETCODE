class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Character,Integer> mp = new HashMap<>();
        String s = String.valueOf(n);
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch,1+mp.getOrDefault(ch,0));
        }
        ArrayList<Character> ans = new ArrayList<>();
        for(var e : mp.keySet()){
            if(mp.get(e) == 1){
                ans.add(e);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());

        list.sort(Map.Entry.comparingByValue());
        
        // Collections.sort(ans);
        // int a = 0;
        // if(ans.size() >0){
        //  a = (ans.get(0) - '0');
        // }
        
        // if(mp.size() == 1){
        //     for(var e : mp.keySet()){
        //         return e-'0';
        //     }
        // }
        Map.Entry<Character, Integer> first = list.get(0);
              return first.getKey() - '0';
        
    }
}