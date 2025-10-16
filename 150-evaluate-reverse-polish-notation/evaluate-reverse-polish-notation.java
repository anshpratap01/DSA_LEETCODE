class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("+") ){
                int top = st.pop();
                int oldtop = st.pop();
                int res =  oldtop + top;
                st.push(res);
            }else if(arr[i].equals("-") ){
                int top1 = st.pop();
                int oldtop1 = st.pop();
                int res2 =  oldtop1 - top1;
                st.push(res2);
                
            }else if (arr[i].equals("*") ){
                 int top2 = st.pop();
                int oldtop2 = st.pop();
                int res3 =  oldtop2 * top2;
                st.push(res3);

            }else if(arr[i].equals("/")){
                int top3 = st.pop();
                int oldtop3 = st.pop();
                int res4 =  oldtop3/top3;
                st.push(res4);

            }else{
                st.push(Integer.parseInt(arr[i]));
            }



        }
        return st.pop();

        
    }
}