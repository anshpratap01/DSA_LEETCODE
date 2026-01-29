class Solution {
    public List<Integer> solve(String s){
         List<Integer> res = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '+' ||  ch == '-' || ch == '*'){
                List<Integer> left = solve(s.substring(0,i));
                List<Integer> right = solve(s.substring(i+1));

                for(int x:left){
                    for(int y:right){
                        if(ch == '+'){
                            res.add(x+y);
                        }
                        else if(ch == '-'){
                            res.add(x-y);
                        }
                        else {
                            res.add(x*y);
                        }
                    }
                
                }
                
            }
            
        }
        if(res.size() == 0) res.add(Integer.valueOf(s));
        return res;
    }
    public List<Integer> diffWaysToCompute(String s) {
        return solve(s);
        
    }
}