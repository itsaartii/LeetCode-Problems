class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1,max2;
        int n = nums.length;
        max1 = (nums[0]*nums[1]*nums[n-1]);
        max2 = (nums[n-1]*nums[n-2]*nums[n-3]); 
        return Math.max(max1,max2);


    }
}