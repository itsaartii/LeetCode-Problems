class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift: gifts){
            maxheap.add(gift);
        }
        for(int i = 0; i < k; i++){
            
            if(!maxheap.isEmpty()){
                int gif = maxheap.poll();
                int num = (int)Math.floor(Math.sqrt(gif));
                maxheap.add(num);
            }
        }
        long total = 0;
        while(!maxheap.isEmpty()){
            total+=maxheap.poll();
        }
        return total;
    }
}