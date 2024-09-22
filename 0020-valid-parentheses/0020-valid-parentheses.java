class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
       
        for(int i = 0; i < s.length(); i++){
            
                
            if(!str.isEmpty() && str.peek()== '(' && s.charAt(i)==')'){
                str.pop();
            }else if(!str.isEmpty() && str.peek()=='[' && s.charAt(i)==']'){
                str.pop();
            }else if(!str.isEmpty() && str.peek() == '{' && s.charAt(i) == '}'){
                str.pop();
            }else{
                str.push(s.charAt(i));
            }

            
        }

        if(str.size()==0){
            return true;
        }else{
            return false;
        }
    }
}