class Solution {
    public void reverseString(char[] s) {
        int left = 0;
       for(int i = s.length-1;i > left;i-- ){
        char temp = s[i]; 
        s[i] = s[left];
        s[left] = temp;
        left++;
       }
    }
}