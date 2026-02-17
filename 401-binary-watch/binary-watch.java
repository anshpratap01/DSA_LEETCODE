class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();

        for (int h = 0; h < 12; h++) {        // hours
            for (int m = 0; m < 60; m++) {    // minutes
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    
                    ans.add(h + ":" + (m < 10 ? "0" + m : m));
                }
            }
        }
        return ans;
        
    }
}