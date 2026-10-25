
import java.util.*;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] arr = new int[r][c];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans.add(mat[i][j]);
            }
        }

        int idx = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = ans.get(idx++);
            }
        }

        return arr;
    }
}
