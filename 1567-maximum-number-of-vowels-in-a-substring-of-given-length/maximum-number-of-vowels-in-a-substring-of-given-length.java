class Solution {
    public int maxVowels(String s, int k) {
       // StringBuilder sb = new StringBuilder();

        int n =  s.length();
        int left = 0; 
        int max = Integer.MIN_VALUE;
        int cnt =0;

        for(int right = 0; right<n; right++){
            char ch = s.charAt(right);
           // sb.append(ch);

            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                cnt++;
            }

            if(right-left +1 == k){
                max = Math.max(max , cnt);
                char sh  = s.charAt(left);

                if(sh == 'a' || sh == 'e'|| sh == 'i' || sh == 'o' || sh == 'u'){
                 cnt--;
                }
                //sb.deleteCharAt(left);
                left++;

            }
        
    }
    return max;
}
}