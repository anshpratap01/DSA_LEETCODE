class Solution {
    public boolean isNStraightHand(int[] hand, int k) {
        int n = hand.length;
        if(n%k != 0) return false;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : hand){
            mp.put(num,1+mp.getOrDefault(num,0));
        }
        Arrays.sort(hand);

        for(int num : hand){
            if(mp.get(num) == 0) continue;
            for(int i = 0; i<k; i++){
                int curr = num+i;
                if(!mp.containsKey(curr) || mp.get(curr) == 0){
                    return false;
                }
                mp.put(curr,mp.get(curr)-1);

            }
        }
        return true;

        
    }
}