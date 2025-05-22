class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        String[] words = s1.split(" ");
        return words[words.length-1].length();
        
    }
}