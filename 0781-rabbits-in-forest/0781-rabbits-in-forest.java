class Solution {
    public int numRabbits(int[] answers) {
        int count = 0;
        if(answers.length == 1) return answers[0]+1;
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        
        for(int ans : answers){
            if(ans==0){
                count++;
            }else{
                int currentCount = hashtable.getOrDefault(ans, 0);
                
                hashtable.put(ans, currentCount + 1);
                
               
                if (hashtable.get(ans) == ans + 1) {
                    count += ans + 1; 
                    hashtable.remove(ans);  
                }
            
            }
            
        }
        for(Integer key : hashtable.keySet()){
            count += key+1;
        }
        return count;
    }
}