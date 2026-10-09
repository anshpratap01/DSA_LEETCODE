class Solution {
    public int minInsertions(String s) {
        int ans = 0, cnt = 0;

        for(char ch : s.toCharArray()){
            if(cnt == 0 && ch == ')'){
                ans+=1;
                cnt+=2;
            }
            else if(cnt %2 == 1 && ch =='('){
                ans+=1;
                cnt-=1;
            }

            if(ch == ')')cnt-=1;
            else cnt+=2;
        }

        ans+=cnt;
        return ans;
    }
}