class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i  = 0; i<nums.length; i++){
            mp.put(nums[i],1+mp.getOrDefault(nums[i],0));

        }
        int idx = 0;
        for( var e : mp.keySet()){
            if(mp.get(e) == 2){
                ans.add(e);
                
            }

        }
        int n = ans.size();
        int arr[] = new int[n];

        for(int i = 0; i<ans.size();i++){
            arr[idx] = ans.get(i);
            idx++;
        }
        return arr;
        
    }
}