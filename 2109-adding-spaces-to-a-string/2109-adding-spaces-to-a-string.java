class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder(s);
        
        int j =0;
        for(int space: spaces){
            
            sb.insert(space+j, " ");
            j++;

        }
        return sb.toString();

    }
}