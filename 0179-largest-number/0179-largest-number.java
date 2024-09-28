class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length]; 
        for(int i = 0; i < nums.length; i++){
            arr[i]=String.valueOf(nums[i]);
            
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        String str = sb.toString();
        return str.startsWith("0") ? "0":str;
    }
}