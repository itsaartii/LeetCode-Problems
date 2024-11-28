class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add((long)num);
        }

        int operations = 0;

        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long x = minHeap.poll(); 
            long y = minHeap.poll(); 
            
            long combined = 2 * Math.min(x, y) + Math.max(x, y);
            
           
            minHeap.add(combined);
            
            operations++;
        }


        return operations;
        
    }
}