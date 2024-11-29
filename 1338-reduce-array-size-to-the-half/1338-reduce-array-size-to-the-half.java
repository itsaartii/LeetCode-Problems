class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freqMap.values());

     
        int removed = 0, setSize = 0, half = arr.length / 2;
        while (removed < half) {
            removed += maxHeap.poll();
            setSize++; 
        }

        return setSize;
    }
}