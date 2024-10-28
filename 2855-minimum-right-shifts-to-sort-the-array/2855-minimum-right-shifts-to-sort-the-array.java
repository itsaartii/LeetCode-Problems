class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) return 0;

        int breakPoint = -1;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) > nums.get((i + 1) % n)) {
                if (breakPoint != -1) {
                    return -1;
                }
                breakPoint = i;
            }
        }

        return n - 1 - breakPoint;
    }
}