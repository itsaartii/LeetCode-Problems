class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2) return 2;
        
        int min = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < nums[min]) {
                min = i;
            }
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
            
        }
        
        int option1 = max+1;
        int option2 = nums.length-min;
        int option3 = (min+1)+(nums.length-max);
        return Math.min(option1,Math.min(option2,option3));
    }
}