class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        //  ans.add(Arrays.asList(-1,-2));
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length-1; i++){
           int diff = Math.abs((arr[i+1]) - arr[i]);
           if(diff ==  min){
            ans.add(Arrays.asList(arr[i],arr[i+1]));
            min = diff;
           }
        else if(diff < min){

        ans.clear();   
        ans.add(Arrays.asList(arr[i], arr[i+1]));
        min = diff;
      }

            
        }
      return ans;
        
    }
}