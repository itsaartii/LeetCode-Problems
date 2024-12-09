class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] specialPrefix = new int[n];

        for (int i = 1; i < n; i++) {
            specialPrefix[i] = specialPrefix[i - 1];
            if ((nums[i - 1] % 2) == (nums[i] % 2)) {
                specialPrefix[i]++;
            }
        }

        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            int mismatches = specialPrefix[to] - (from > 0 ? specialPrefix[from] : 0);
            answer[i] = mismatches == 0;
        }

        return answer;
    }
}