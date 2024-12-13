class Solution {
    public long findScore(int[] nums) {
        boolean arr[] = new boolean[nums.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]==b[0]? Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
        for(int i = 0; i < nums.length; i++){
            pq.offer(new int[]{nums[i],i});
        }
        long score = 0;
        while(!pq.isEmpty()){
            int ele[] = pq.poll();
            int score1 = ele[0];
            int index = ele[1];
            if(arr[index]) continue;
            score+=score1;
            if(index > 0) arr[index-1]=true;
            if(index < nums.length-1) arr[index+1]=true;
        }
        return score;
        
    }
}