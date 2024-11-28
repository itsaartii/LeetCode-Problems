class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        double totalSum = 0;
        for (int num : nums) {
            totalSum += num;
            maxHeap.add((double) num);
        }

        double target = totalSum / 2;
        double currentSum = totalSum;
        int operations = 0;

        while (currentSum > target) {
            double largest = maxHeap.poll();
            double reduced = largest / 2;
            currentSum -= reduced;
            maxHeap.add(reduced);
            operations++;
        }

        return operations;
        
    }
}