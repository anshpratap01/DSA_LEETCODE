class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> ans = new ArrayList<>();

        PriorityQueue<Integer> max = new PriorityQueue<>(
            (a, b) -> {
                int diff = Math.abs(b - x) - Math.abs(a - x);
                if (diff == 0) return b - a; 
                return diff;
            }
        );

        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);   
            if (max.size() > k) {
                max.poll();   
            }
        }

        while (!max.isEmpty()) {
            ans.add(max.poll());
        }

        Collections.sort(ans); 
        return ans;
    }
}
