class Solution {
    public int minSwaps(String s) {
        int balance = 0;  
        int swaps = 0;   

      
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                balance++;  
            } else {
                balance--;  
            }
            
          
            if (balance < 0) {
                swaps++;      
                balance = 1; 
            }
        }

        return swaps; 
    }
}