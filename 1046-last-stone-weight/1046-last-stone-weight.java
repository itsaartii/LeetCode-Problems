class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            maxheap.add(stone);
        }
        while(maxheap.size()>1){
            int a = maxheap.poll();
            int b = maxheap.poll();
            if(a != b){
                a -=b;
                maxheap.add(a);
            }
        }
        return maxheap.size()==1? maxheap.poll(): 0;
    }
}