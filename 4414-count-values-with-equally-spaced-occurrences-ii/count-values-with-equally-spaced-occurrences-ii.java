class Solution {
    public int countSpecialIntegers(int[] nums) {
         HashMap<Integer ,List<Integer>> mp = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i<nums.length; i++){
            mp.putIfAbsent(nums[i] , new ArrayList<>());
            mp.get(nums[i]).add(i);
        }

        for(List<Integer> list : mp.values()){

            if(list.size() >= 3){
                boolean flag = true;


            int diff =  list.get(1) - list.get(0);

            for(int i = 2; i< list.size();i++){
                if(list.get(i) - list.get(i-1) != diff){
                    flag = false;
                    break;
                }
            }

            if(flag){
                cnt++;
            }

               

                // if(idx2 - idx1 == idx3-idx2){
                //     cnt++;
                // }
            }
        }
        return cnt;
        
    }
}