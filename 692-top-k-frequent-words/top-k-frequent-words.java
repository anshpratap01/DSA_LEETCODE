import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] w, int k) {

        
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < w.length; i++) {
            mp.put(w[i], mp.getOrDefault(w[i], 0) + 1);
        }

        
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(mp.entrySet());

        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a,
                               Map.Entry<String, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                }
                return a.getKey().compareTo(b.getKey());
            }
        });

        
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }

        return ans;
    }
}
