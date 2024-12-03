class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) return 0; 
        int n = weights.length;
        int[] pairsums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pairsums[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(pairsums);
        long maxSum = 0, minSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += pairsums[i];
            maxSum += pairsums[n - 2 - i];
        }

        return maxSum - minSum;


    }
}