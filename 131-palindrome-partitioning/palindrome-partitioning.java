class Solution {

    List<List<String>> res;

    public boolean ispalindrom(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void solve(String s, int idx, List<String> ans){
        if(idx == s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = idx; i < s.length(); i++){
            String sub = s.substring(idx, i+1);

            if(ispalindrom(sub)){
                ans.add(sub);
                solve(s, i+1, ans);
                ans.remove(ans.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        solve(s, 0, new ArrayList<>());
        return res;
    }
}