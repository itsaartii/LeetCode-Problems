class Solution {
    public boolean canChange(String start, String target) {
        int ptr1 = 0;
        int ptr2 = 0;
        int n = start.length();

        while(ptr1 < n || ptr2 < n){
            while(ptr1 < n && start.charAt(ptr1) == '_'){
                ptr1++;
            }
            while(ptr2 < n && target.charAt(ptr2) == '_'){
                ptr2++;
            }
            if(ptr1 <n && ptr2 <n && start.charAt(ptr1)==target.charAt(ptr2)){
                if(start.charAt(ptr1)=='L' && ptr2>ptr1){
                    return false;
                }else if(start.charAt(ptr1)=='R' && ptr2<ptr1){
                    return false;
                }

            }else if(ptr1 < n && ptr2 < n && start.charAt(ptr1)!=target.charAt(ptr2)){
                return false;
            }
            ptr1++;
            ptr2++;
        }
        
        if(ptr1==ptr2){
            return true;
        }else{
            return false;
        }
        
        
    }
}