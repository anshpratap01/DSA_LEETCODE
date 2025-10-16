class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

    String arr[] = path.split("/", -1);

    for(int i = 0; i<arr.length; i++){
      if(arr[i].equals("") ||  arr[i].equals(".")) {
        continue;
      }
       if(!arr[i].equals("..")){
        st.push(arr[i]);
      }else{
        if(!st.isEmpty()){
        st.pop();
        }
      }
    }

    if(st.isEmpty()){
        return "/";
    }
    String  result = "";
    while(!st.isEmpty()){
        result = "/"+ st.peek() +  result;
        st.pop();
        
    }
    return result;

        
    }
}