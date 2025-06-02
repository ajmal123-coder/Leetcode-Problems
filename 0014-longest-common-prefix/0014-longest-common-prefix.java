class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int prefixLength = prefix.length();

        for(int i = 1;i<strs.length;i++){
            String s = strs[i];
            while(prefixLength > s.length() || !prefix.equals(s.substring(0,prefixLength))){
                prefixLength--;
                if(prefixLength == 0){
                    return "";
                }
                prefix = prefix.substring(0,prefixLength);
            }
        }
        return prefix;
    }
}