class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int no = 1;

        for(int i = 0; i<target.length; i++){
            while(no<target[i]){
                ans.add("Push");
                ans.add("Pop");
                no++;
            }
            ans.add("Push");
            no++;
        }
        return ans;
        
    }
}