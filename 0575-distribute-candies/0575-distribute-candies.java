class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandies = new HashSet<>();
        
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
       
        int maxCandiesAllowed = candyType.length / 2;
        
        return Math.min(uniqueCandies.size(), maxCandiesAllowed);
    }
}