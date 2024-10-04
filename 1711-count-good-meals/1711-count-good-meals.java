class Solution {
    public int countPairs(int[] deliciousness) {
         int MOD = 1_000_000_007;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int del : deliciousness) {
    
            for (int i = 0; i <= 21; i++) {
                int targetSum = 1 << i; // 2^i
                int complement = targetSum - del;
                
              
                count = (count + freq.getOrDefault(complement, 0)) % MOD;
            }

     
            freq.put(del, freq.getOrDefault(del, 0) + 1);
        }

        return count;
        
    }
}