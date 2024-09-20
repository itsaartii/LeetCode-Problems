class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i  < nums.length; i++){
            if(nums[i]>0){
                min = Math.min(min,nums[i]);
                max = Math.max(max,nums[i]);

            }

        }
        if(min > 1){
            return 1;
        }else{
            for(int i = 1; i <= max; i++){
                if(!set.contains(i)){
                    return i;
                }
            }
        }
        return max+1;
    }
}