class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> ans = new ArrayList<>();
        HashMap<String ,List<String>> mp = new HashMap<>();

        for(int i = 0; i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if(!mp.containsKey(key)){
                mp.put(key , new ArrayList<>());
            }
            mp.get(key).add(strs[i]);


        }
       return new ArrayList<>(mp.values());

        
    }
}