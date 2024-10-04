class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for(int machine : machines){
            sum += machine;
        }
        if(sum%machines.length != 0) return -1;
        int target =sum/machines.length;
        int cumulativeImbalance = 0;  
        int maxMoves = 0; 
        for (int dresses : machines) {
           
            int imbalance = dresses - target;
            cumulativeImbalance += imbalance;
          
            maxMoves = Math.max(maxMoves, Math.max(Math.abs(cumulativeImbalance), imbalance));
        }
        
        return maxMoves;
        
    }
}