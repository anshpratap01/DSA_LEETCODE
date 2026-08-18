class Solution {
    public int maximumGap(String s, String st ) {
        int n = s.length();
        int m = st.length();
        int ans = 0;
        int l[] = new int[n];
        int r[] = new int[n];

        int i =0;
        for(int j = 0; i<n;j++){
            if(s.charAt(i) == st.charAt(j)){
                l[i] = j;
                i++;
            }
            
        }

        i = n-1;
        for(int j = m-1;i>=0; j--){
            if(s.charAt(i) == st.charAt(j)){
                r[i] = j;
                i--;
            }
        }

        for(int j = 1; j<n; j++){
            if(r[j] -l[j-1]> ans){
                ans = r[j] - l[j-1];
            }
        }
        return ans;
        
    }
}