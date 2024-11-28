class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++){
            int n = Character.getNumericValue(str.charAt(i));
            if(n%2==0){
                even.add(n);
            }else{
                odd.add(n);
            }
        }
        int number = 0;
        for(int i = 0; i < str.length(); i++){
            int n = Character.getNumericValue(str.charAt(i));
            if(n%2==0){
                number = number*10+even.poll();
            }else{
                number = number*10+odd.poll();
            }
        }
        return number;
    }
}