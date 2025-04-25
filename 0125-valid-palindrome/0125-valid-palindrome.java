class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String a ="";
        for(int i = ns.length()-1; i >= 0;i--){
            a += String.valueOf(ns.charAt(i)); 
        }
        if(ns.equals(a)){
            return true;
        }else{
            return false;
        }
    }
}