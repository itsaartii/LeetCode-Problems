class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lenS1 = s1.length(), lenS2 = s2.length();
        
        if (lenS1 > lenS2) return false;
        
        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();
        
        for (int i = 0; i < lenS1; i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            windowCount.put(s2.charAt(i), windowCount.getOrDefault(s2.charAt(i), 0) + 1);
        }
        
        if (s1Count.equals(windowCount)) return true;
        
        for (int i = lenS1; i < lenS2; i++) {
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i - lenS1);
            
            windowCount.put(newChar, windowCount.getOrDefault(newChar, 0) + 1);
            windowCount.put(oldChar, windowCount.get(oldChar) - 1);
            
            if (windowCount.get(oldChar) == 0) {
                windowCount.remove(oldChar);
            }
            
            if (s1Count.equals(windowCount)) return true;
        }
        
        return false;
    }
}