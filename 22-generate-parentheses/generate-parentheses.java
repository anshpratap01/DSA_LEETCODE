class Solution {
    public static void helper(int n , int l , int r , List<String> ans, String s){
        if(r == n){
            ans.add(s);
            return;
        }

    if(l<n){
        helper(n,l+1,r,ans,s+"(");
    }
    if(r<l){
         helper(n,l,r+1,ans,s+")");

    }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans =  new ArrayList<>();
        String s = "";
        helper(n,0,0,ans, s);
        return ans;
        
    }
}