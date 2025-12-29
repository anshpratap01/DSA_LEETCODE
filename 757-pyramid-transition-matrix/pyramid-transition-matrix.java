import java.util.*;

class Solution {
    Map<String, List<Character>> m = new HashMap<>();
    Set<String> f = new HashSet<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (String s : allowed) {
            String k = s.substring(0, 2);
            m.computeIfAbsent(k, x -> new ArrayList<>()).add(s.charAt(2));
        }
        return solve(bottom, new StringBuilder(), 0);
    }

    boolean solve(String cur, StringBuilder nxt, int i) {
        if (cur.length() == 1) return true;
        if (i == cur.length() - 1) {
            if (f.contains(nxt.toString())) return false;
            boolean r = solve(nxt.toString(), new StringBuilder(), 0);
            if (!r) f.add(nxt.toString());
            return r;
        }

        String k = cur.substring(i, i + 2);
        if (!m.containsKey(k)) return false;

        for (char c : m.get(k)) {
            nxt.append(c);
            if (solve(cur, nxt, i + 1)) return true;
            nxt.setLength(nxt.length() - 1);
        }
        return false;
    }
}