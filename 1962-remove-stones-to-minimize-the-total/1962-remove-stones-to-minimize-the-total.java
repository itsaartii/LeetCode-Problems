class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int pile: piles){
            maxheap.add(pile);
        }
        for(int i = 0; i < k; i++){
            if(!maxheap.isEmpty()){
                int p = maxheap.poll();
                p-=(int)Math.floor(p/2);
                maxheap.add(p);
            }
            
        }
        int sum = 0;
        while(!maxheap.isEmpty()){
            sum+=maxheap.poll();
        }
        return sum;
    }
}