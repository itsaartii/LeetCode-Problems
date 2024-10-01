class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int left = 0;
        int right = 0;
        
        int n= cardPoints.length;
        int max = 0;
        for(int i = 0; i < k; i++){
            max += cardPoints[i];
        }
        if(k==n) return max;
        left = max;
       
        
        int p = 1;
        for(int i = k-1; i>=0; i--){
            left -= cardPoints[i];
            right += cardPoints[n-p];
            p++;
            max = Math.max(max,left+right);
            
        }
        return max;
    }
}