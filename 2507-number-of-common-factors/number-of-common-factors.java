class Solution {
    public void divisor(int a , HashMap<Integer,Integer> mp){
        for(int i = 1; i<=a; i++){
            if(a%i == 0){
                mp.put(i,1+mp.getOrDefault(i,0));
            }
        }
        for(var e : mp.keySet()){
            System.out.println(e + " --> " + mp.get(e));
            
        }
    }
    public int commonFactors(int a, int b) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        divisor( a , mp);
        divisor( b , mp);
        int cnt = 0;
        for(var e: mp.keySet()){
            if(mp.get(e)>1){
                cnt++;
            }
        }
        return cnt;
        
    }
}