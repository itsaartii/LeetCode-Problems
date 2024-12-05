class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < barcodes.length; i++){
            map.put(barcodes[i],map.getOrDefault(barcodes[i],0)+1);

        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        int arr[] = new int[barcodes.length];
        int index = 0;
        int[] temp = null;

        while (!pq.isEmpty()) {
          
            int[] current = pq.poll();
            arr[index++] = current[0];
            current[1]--; 
            if (temp != null && temp[1] > 0) {
                pq.add(temp);
            }
            temp = current;
        }

        return arr;
        
    }
}