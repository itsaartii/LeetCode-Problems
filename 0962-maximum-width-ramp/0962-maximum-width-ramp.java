class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        int maxWidth = 0;
        int minIndex = n;
        
        for (int index : indices) {
            maxWidth = Math.max(maxWidth, index - minIndex);
            minIndex = Math.min(minIndex, index);
        }
        
        return maxWidth;
    }
}