class Solution {
    public boolean issorted(List<Integer> ans ){
        for(int i = 0; i<ans.size()-1; i++){
            if(ans.get(i) > ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minsum(List<Integer> ans ){
        int minsum = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i<ans.size()-1; i++){
            int sum = ans.get(i) + ans.get(i+1);
            if(sum < minsum){
                minsum = sum;
                idx = i;
            }
        }
        return idx;
    }
    public int minimumPairRemoval(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

       int cnt = 0;
        for(int ele : nums){
            ans.add(ele);

        }

        while(!issorted(ans)){
            int index = minsum(ans);
            int sum = ans.get(index) + ans.get(index+1);
            ans.set(index,sum);
            ans.remove(index+1);
            cnt++;
           for(int i = 0; i<ans.size(); i++){
              System.out.print(ans.get(i)+" ");
           }
           System.out.println();


        }
        return cnt;
        
        
    }
}