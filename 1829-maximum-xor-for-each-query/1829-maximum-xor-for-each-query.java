class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] answer = new int[n];
        
    
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        
     
        int maxVal = (1 << maximumBit) - 1;
        

        for (int i = 0; i < n; i++) {
       
            answer[i] = totalXor ^ maxVal;
        
            totalXor ^= nums[n - 1 - i];
        }
        
        return answer;
    }
}