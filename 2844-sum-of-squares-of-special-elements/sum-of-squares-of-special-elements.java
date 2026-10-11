class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
         int sum = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
            if(n%i == 0){
                ans.add(nums[i-1]);
                
            }
        }
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
        for(int i = 0; i<ans.size(); i++){
            int sq = ans.get(i);
            sum += (sq*sq);
        }
        return sum;
        
        
    }
}