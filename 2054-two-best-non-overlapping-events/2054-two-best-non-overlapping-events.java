class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        int[] prefixMax = new int[events.length];
        int maxVal = 0;
        for (int i = 0; i < events.length; i++) {
            maxVal = Math.max(maxVal, events[i][2]);
            prefixMax[i] = maxVal;
        }
        int result = 0;
        for (int i = 0; i < events.length; i++) {
            int currentValue = events[i][2];
            int left = 0, right = i - 1, bestIdx = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < events[i][0]) {
                    bestIdx = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (bestIdx != -1) {
                currentValue += prefixMax[bestIdx];
            }

            result = Math.max(result, currentValue);
        }
        return result;
    }
}