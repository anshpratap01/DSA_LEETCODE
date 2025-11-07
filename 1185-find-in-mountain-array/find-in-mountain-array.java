/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index
        int peak = findPeakIndex(mountainArr, n);
        
        // Step 2: Binary search on ascending part
        int left = binarySearch(mountainArr, 0, peak, target, true);
        
        // Step 3: If not found on left, search right (descending part)
        if (left != -1) return left;
        
        int right = binarySearch(mountainArr, peak + 1, n - 1, target, false);
        
        return right;
    }

    // Helper to find the index of the peak (maximum element)
    private int findPeakIndex(MountainArray arr, int n) {
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // or end (they’re equal here)
    }

    // Generic binary search for both increasing/decreasing parts
    private int binarySearch(MountainArray arr, int start, int end, int target, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);
            
            if (val == target) return mid;
            
            if (asc) { // ascending order
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {   // descending order
                if (val < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
