import java.util.Arrays;

public class Solution {
    
    public static long solve(int n, long[][] a) {
        // Sort intervals by their start times, then end times if start times are equal
        Arrays.sort(a, (x, y) -> {
            if (x[0] != y[0]) {
                return Long.compare(x[0], y[0]);
            }
            return Long.compare(x[1], y[1]);
        });
        
        long lo = 0;
        long hi = a[a.length - 1][1] - a[0][0];
        long ans = 0;
        
        while (lo <= hi) {
            long m = lo + (hi - lo) / 2;
            if (ok(a, m)) {
                ans = m;
                lo = m + 1;
            } else {
                hi = m - 1;
            }
        }
        
        return ans;
    }
    
    private static boolean ok(long[][] a, long d) {
        long p = (long) -1e18; // Equivalent to -10**18
        for (long[] interval : a) {
            long l = interval[0];
            long r = interval[1];
            long x = Math.max(l, p + d);
            if (x > r) {
                return false;
            }
            p = x;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test case 1: basic example
        int n1 = 3;
        long[][] a1 = {{1, 5}, {2, 6}, {3, 7}};
        System.out.println("Test 1: n=" + n1 + ", intervals=" + Arrays.deepToString(a1));
        System.out.println("Result: " + solve(n1, a1));

        // Test case 2: overlapping intervals
        int n2 = 2;
        long[][] a2 = {{1, 3}, {2, 4}};
        System.out.println("\nTest 2: n=" + n2 + ", intervals=" + Arrays.deepToString(a2));
        System.out.println("Result: " + solve(n2, a2));

        // Test case 3: single interval
        int n3 = 1;
        long[][] a3 = {{0, 10}};
        System.out.println("\nTest 3: n=" + n3 + ", intervals=" + Arrays.deepToString(a3));
        System.out.println("Result: " + solve(n3, a3));

        // Test case 4: tight intervals
        int n4 = 3;
        long[][] a4 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("\nTest 4: n=" + n4 + ", intervals=" + Arrays.deepToString(a4));
        System.out.println("Result: " + solve(n4, a4));
    }
}