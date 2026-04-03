import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        
        // Step 1: Frequency using HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        
        pq.addAll(map.keySet());
        
        StringBuilder result = new StringBuilder();
        
        // Step 3: Pick top 2 elements
        while(pq.size() >= 2) {
            char first = pq.poll();
            char second = pq.poll();
            
            result.append(first);
            result.append(second);
            
            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);
            
            if(map.get(first) > 0) pq.add(first);
            if(map.get(second) > 0) pq.add(second);
        }
        
        // Step 4: If one character left
        if(!pq.isEmpty()) {
            char last = pq.poll();
            
            if(map.get(last) > 1) return "";
            
            result.append(last);
        }
        
        return result.toString();
    }
}