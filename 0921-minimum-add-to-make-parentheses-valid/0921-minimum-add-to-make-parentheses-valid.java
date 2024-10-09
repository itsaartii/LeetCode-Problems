class Solution {
    public int minAddToMakeValid(String s) {
        char arr[] = s.toCharArray();
        int left_paren = 0;
        int right_paren = 0;
        for(char c: arr){
            if(c == '('){
                left_paren++;
            }else if(c == ')'){
                if(left_paren > 0){
                    left_paren--;
                }else{
                    right_paren++;
                }
            }
        }
        return left_paren+right_paren;
    }
}