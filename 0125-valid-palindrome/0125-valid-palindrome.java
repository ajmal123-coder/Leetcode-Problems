class Solution {
    public boolean isPalindrome(String s) {
       String cs = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       StringBuilder ns = new StringBuilder();
       for(int i = cs.length()-1;i>=0;i--){
            ns.append(cs.charAt(i));
       }
       return cs.equals(ns.toString());
    }
}