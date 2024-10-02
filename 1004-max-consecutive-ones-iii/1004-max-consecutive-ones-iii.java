class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; 
        int right = 0;
        int countzeros = 0;
        int max = 0;
        while(right < nums.length){
            if(nums[right]==0){
               countzeros++;
            }
            if(countzeros > k){
                
                if(nums[left]==0){
                countzeros--;
                
                }
                left++;
            }
            if(countzeros <= k){
                max = Math.max(max,right-left+1);
                
            }
            right++;
            
        }
        return max;
    }
}