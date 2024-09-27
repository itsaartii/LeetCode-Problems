class Solution {
    public int brokenCalc(int startValue, int target) {
        int operation = 0;
        while(startValue < target){
            if(target%2==0){
                target = target/2;
            }else{
                target++;
            }
            operation++;
            
        }
        return operation + (startValue - target);
    }
}