class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Stack<Integer> st = new Stack<>();
        
        
       
        int n =nums1.length;
        int m = nums2.length;
        int res [] = new int[m];
        int res2 [] = new int[n];
        

        res[m-1] = -1;
        st.push(nums2[m-1]);
        
        for(int i = m-2; i>=0; i--){
            while(st.size()>0 && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(nums2[i]);
    }

    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            if(nums1[i]== nums2[j]){
                res2[i] = res[j];
            }
        }
    }
    return res2;
}
}