class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int cls[] : classes){
            pq.offer(new double[]{gain(cls[0],cls[1]),cls[0],cls[1]});
        }
        while(extraStudents-->0){
            double arr[] = pq.poll();
            arr[1]++;
            arr[2]++;
            arr[0]=gain(arr[1],arr[2]);
            pq.offer(arr);
        }
         
        double sum = 0;
        while(!pq.isEmpty()){
            double arr[] = pq.poll();
            sum+=(arr[1]/arr[2]);
        }

        return sum/classes.length;

    }
    private double gain(double pass, double total){
        return ((pass+1)/(total+1))-(pass/total);

    }
}