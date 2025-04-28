class Solution {
    public boolean isPalindrome(String s) {
       String cs = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       return cs.equals(new StringBuilder(cs).reverse().toString());
       
    }
}