class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(istoken(token)){
                int b = stack.pop();
                int a = stack.pop();
                int c = operation(a, b, token);
                stack.push(c);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private Boolean istoken(String token){
        return "+-*/".contains(token);
    }

    private int operation(int a, int b, String operator){
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

    }
}