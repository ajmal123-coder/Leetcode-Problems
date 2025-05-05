class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(n < m){
            return -1;
        }
        for(int i = 0; i<=n-m;i++){
            int p1 = i;
            int p2 = 0;
            while( p2 < m && haystack.charAt(p1) == needle.charAt(p2)){
                p1++;
                p2++;
            }
            if(p2 == m){
                return i;
            }
        }
        return -1;
    }
}