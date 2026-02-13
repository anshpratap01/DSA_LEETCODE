class Solution {
    public int longestBalanced(String s) {
        int ans = 1;
        int n = s.length();

        int consecutive = 1;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i - 1)) consecutive++;
            else consecutive = 1;

            ans = Math.max(ans, consecutive);
        }

        Map<Integer, Integer> diffIdx = new HashMap<>();
        int a = 0, b = 0;
        diffIdx.put(0, -1);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'a') a++;
            else if(s.charAt(i) == 'b') b++;
            else diffIdx = new HashMap<>();

            int preDiff = a - b;
            if(!diffIdx.containsKey(preDiff)) diffIdx.put(preDiff, i);
            else ans = Math.max(ans, i - diffIdx.get(preDiff));
        }

        diffIdx = new HashMap<>();
        int c = 0; b = 0;
        diffIdx.put(0, -1);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'c') c++;
            else if(s.charAt(i) == 'b') b++;
            else diffIdx = new HashMap<>();

            int preDiff = c - b;
            if(!diffIdx.containsKey(preDiff)) diffIdx.put(preDiff, i);
            else ans = Math.max(ans, i - diffIdx.get(preDiff));
        }

        diffIdx = new HashMap<>();
        c = 0; a = 0;
        diffIdx.put(0, -1);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'c') c++;
            else if(s.charAt(i) == 'a') a++;
            else diffIdx = new HashMap<>();

            int preDiff = c - a;
            if(!diffIdx.containsKey(preDiff)) diffIdx.put(preDiff, i);
            else ans = Math.max(ans, i - diffIdx.get(preDiff));
        }

        Map<String, Integer> pairDiff = new HashMap<>();
        a = 0; b = 0; c = 0;
        pairDiff.put("0 0", -1);
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'a') a++;
            else if(s.charAt(i) == 'b') b++;
            else c++;

            int preDiff_1 = a - b;
            int preDiff_2 = a - c;
            String diff = preDiff_1 + " " + preDiff_2;
            if(!pairDiff.containsKey(diff)) pairDiff.put(diff, i);
            else ans = Math.max(ans, i - pairDiff.get(diff));
        }

        return ans;
    }
}