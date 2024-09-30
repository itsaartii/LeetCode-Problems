class Solution {
    public int getWinner(int[] arr, int k) {
        int start = arr[0];
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>start){
                start = arr[i];
                count = 1;
            }else{
                count++;
            }
            
            
            if(count==k){
                return start;
            }
        }
        return start;
    }
}