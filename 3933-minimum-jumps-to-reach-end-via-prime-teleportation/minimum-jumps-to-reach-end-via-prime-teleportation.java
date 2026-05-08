class Solution {
       
    public int minJumps(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> k = new ArrayList<>();
            int num = nums[i];
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    k.add(j);

                    while (num % j == 0)
                        num /= j;
                }
            }
            if (num > 1)
                k.add(num);

            for (int j : k) {
                if (map.containsKey(j))
                    map.get(j).add(i);
                else {
                    ArrayList<Integer> p = new ArrayList<>();
                    p.add(i);
                    map.put(j, p);
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[n];
        q.offer(0);
        b[0] = true;

        while (!q.isEmpty()) {
            int s = q.size();

            while (s-- > 0) {
                int ci = q.poll();

                if (ci == n - 1)
                    return ans;

                addin(ci - 1, b, q, n);
                addin(ci + 1, b, q, n);

                int v = nums[ci];

                if (isp(v)) {
                    ArrayList<Integer> k = map.get(v);
                    if (k != null)
                        for (int i : k) {
                            if (!b[i]) {
                                b[i] = true;
                                q.offer(i);
                            }
                        }
                    map.remove(v);
                }
            }
            ans += 1;
        }
        return -1;
    }
    public void addin(int i , boolean[] b, Queue<Integer> q, int n) {
        if (i < 0 || i >= n)
            return;
        if (b[i])
            return;
        b[i] = true;
        q.offer(i);
    }
    public boolean isp(int val) {
        if (val  < 2)
            return false;
        for (int i = 2; i * i <= val; i++)
            if(val % i == 0)
                return false;
        return true;
    }
}