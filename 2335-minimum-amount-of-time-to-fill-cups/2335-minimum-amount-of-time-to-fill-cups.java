class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount); 
        int totalSum = amount[0] + amount[1] + amount[2];
        int maxAmount = amount[2]; 
        
   
        return Math.max(maxAmount, (totalSum + 1) / 2);
    }
}