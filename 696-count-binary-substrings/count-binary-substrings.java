class Solution {
   public int countBinarySubstrings(String s) {
    ArrayList<Integer> ans  = new ArrayList<>();

    int count = 1;   

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i - 1)) {
            count++;
        } else {
            ans.add(count);  
            count = 1;          
        }
    }

    ans.add(count);  // for last 

    
    int sum = 0;
    for (int i = 1; i < ans.size(); i++) {
        sum += Math.min(ans.get(i), ans.get(i - 1));
    }

    return sum;
}

}