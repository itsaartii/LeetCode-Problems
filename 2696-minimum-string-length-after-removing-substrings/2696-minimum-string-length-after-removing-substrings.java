class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        
        
        for(char a : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()=='A' && a =='B'){
                
                stack.pop();
                    

                
            }
            else if(!stack.isEmpty() && stack.peek()=='C' && a == 'D'){
                
                    stack.pop();
                    

                
            }else{stack.push(a);}
        }

        return stack.size();
    }
}