import java.util.Arrays;

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Base case: agar sum k se divide nahi hota, toh equal subsets possible nahi hain
        if (sum % k != 0) return false;
        
        int target = sum / k;
        
        // Optimization 1: Sort array to start picking larger numbers first
        Arrays.sort(nums);
        int n = nums.length;
        
        // Agar max number hi target se bada hai, toh subset banana impossible hai
        if (nums[n - 1] > target) return false;
        
        boolean[] visited = new boolean[n];
        
        // Backtracking function call
        return backtrack(nums, n - 1, 0, k, target, visited);
    }
    
    private boolean backtrack(int[] nums, int start, int currentSum, int kLeft, int target, boolean[] visited) {
        // Agar k-1 buckets perfectly fill ho gaye hain, toh last bucket automatically fill ho jayega
        if (kLeft == 1) return true;
        
        // Ek bucket poora fill ho gaya, ab next bucket ke liye search shuru karo
        if (currentSum == target) {
            return backtrack(nums, nums.length - 1, 0, kLeft - 1, target, visited);
        }
        
        // Array mein peeche se iterate karte hain (largest elements pehle)
        for (int i = start; i >= 0; i--) {
            // Agar element already visited hai, ya currentSum limit cross kar raha hai, skip it
            if (visited[i] || currentSum + nums[i] > target) continue;
            
            // TAKE the element
            visited[i] = true;
            
            // Recursively baaki bache elements ko check karo
            if (backtrack(nums, i - 1, currentSum + nums[i], kLeft, target, visited)) {
                return true;
            }
            
            // BACKTRACK: Undo the choice agar ye element answer nahi de raha
            visited[i] = false;
            
            // Optimization 2: Agar bucket completely empty thi aur humne first largest 
            // valid element try kiya aur solution nahi mila, toh iska matlab is element 
            // ki kisi aur bucket mein bhi jagah nahi ban payegi. Prune the tree!
            if (currentSum == 0) break;
            
            // Optimization 3: Agar element currentSum ko exactly target banata hai lekin 
            // aage buckets nahi ban pa rahe, toh smaller elements se aur zyada combinations 
            // try karna waste of time hai.
            if (currentSum + nums[i] == target) break;
        }
        
        return false;
    }
}