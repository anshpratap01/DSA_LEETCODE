class Solution {
    public boolean issorted(List<Integer> list){
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minindx(List<Integer> list){
        int index = -1;
        int minsum = Integer.MAX_VALUE;
        for(int i = 0; i<list.size()-1; i++){
            int sum = list.get(i) + list.get(i+1);
            if(sum<minsum){
                index = i;
                minsum = sum;
            }
        }
        return index;

    }
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int nn : nums) {
            list.add(nn);
        }

      
            while (!issorted(list)){
                int idx = minindx(list);
                int summ = list.get(idx) + list.get(idx+1);
                list.set(idx,summ);
                list.remove(idx+1);
                cnt++;

            }
        
        return cnt;

        
    }
}