class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        String[] words = s1.split(" ");
        String a = words[words.length-1];
        return a.length();
        
    }
}