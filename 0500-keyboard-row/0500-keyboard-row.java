class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>();
        for (char c : "qwertyuiop".toCharArray()) row1.add(c);
        
        Set<Character> row2 = new HashSet<>();
        for (char c : "asdfghjkl".toCharArray()) row2.add(c);
        
        Set<Character> row3 = new HashSet<>();
        for (char c : "zxcvbnm".toCharArray()) row3.add(c);
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            Set<Character> row = row1.contains(lowercaseWord.charAt(0)) ? row1 :
                                 row2.contains(lowercaseWord.charAt(0)) ? row2 : row3;
            
            boolean isValid = true;
            for (char c : lowercaseWord.toCharArray()) {
                if (!row.contains(c)) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) result.add(word);
        }
        
        return result.toArray(new String[0]);
    }
}