class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = wt.length;
        double[][] items = new double[n][3];  // [value, weight, ratio]

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = (double) val[i] / wt[i];
        }

        // Sort by ratio (descending)
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

        double maxProfit = 0.0;

        for (int i = 0; i < n && capacity > 0; i++) {
            if (items[i][1] <= capacity) {
                // Take full item
                maxProfit += items[i][0];
                capacity -= items[i][1];
            } else {
                // Take fractional part
                double fraction = (double) capacity / items[i][1];
                maxProfit += items[i][0] * fraction;
                capacity = 0;  // knapsack is full
            }
        }

        return maxProfit;
    }
}