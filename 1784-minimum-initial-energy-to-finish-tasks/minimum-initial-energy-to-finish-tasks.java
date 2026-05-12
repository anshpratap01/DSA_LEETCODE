class Solution {
    public int minimumEffort(int[][] tasks) {
        int totalActual = 0;
        for (int[] t: tasks) {
            totalActual += t[0];
        }
        int energy = totalActual;
        Arrays.sort(tasks, (x, y) -> Integer.compare(y[1] - y[0], x[1] - x[0]));

        for (int[] t: tasks) {
            if (energy < t[1]) {
                totalActual += t[1] - energy;
                energy += t[1] - energy;
            }
            energy -= t[0];
        }
        return totalActual;
    }
}