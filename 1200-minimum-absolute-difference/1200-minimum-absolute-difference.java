class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> pairs = new ArrayList<>();

        
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

      
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                pairs.add(pair);
            }
        }

        return pairs;
    }
}