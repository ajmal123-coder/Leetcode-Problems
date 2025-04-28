class Solution {
    public boolean isPalindrome(String s) {
       String cs = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       String ns ="";
       for(int i = cs.length()-1;i>=0;i--){
            ns += String.valueOf(cs.charAt(i));
       }
       if(cs.equals(ns)){
        return true;
       }
       else{
        return false;
       }
    }
}