class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int level = 1;
            List<Integer> a = new ArrayList<>();
            a.add(level);
            for(int j = 1; j<=i; j++){
                level = level*(i-j+1);
                level = level/j;
                a.add(level);

            }
            ans.add(a);
        }
        return ans;

        
    }
}