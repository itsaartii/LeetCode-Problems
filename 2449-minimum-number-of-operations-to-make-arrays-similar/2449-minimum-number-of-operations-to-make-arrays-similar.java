class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);

        List<Integer> numsodd = new ArrayList<>();
        List<Integer> numseven = new ArrayList<>();
        List<Integer> targetodd = new ArrayList<>();
        List<Integer> targeteven = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                numseven.add(num);
            } else {
                numsodd.add(num);
            }
        }
        for (int t : target) {
            if (t % 2 == 0) {
                targeteven.add(t);
            } else {
                targetodd.add(t);
            }
        }

        long operations = 0;
        for (int i = 0; i < numsodd.size(); i++) {
            operations += Math.abs(numsodd.get(i) - targetodd.get(i)) / 2;
        }
        for (int i = 0; i < numseven.size(); i++) {
            operations += Math.abs(numseven.get(i) - targeteven.get(i)) / 2;
        }

        return operations / 2;
    }
}