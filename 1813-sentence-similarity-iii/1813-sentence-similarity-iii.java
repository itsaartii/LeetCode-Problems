class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        int len1 = words1.length, len2 = words2.length;
        
        if (len1 > len2) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        int i = 0; 
        int j = len1 - 1; 
        int k = len2 - 1; 
        
      
        while (i < len1 && words1[i].equals(words2[i])) {
            i++;
        }
        
        // Compare words from the end of both arrays
        while (j >= i && words1[j].equals(words2[k])) {
            j--;
            k--;
        }
        
        return j < i;
    }
}