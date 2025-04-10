class Solution {
    public boolean isPalindrome(int x) {
        int first = x;
        int reverse = 0;
        while(x>0){
            int remainder = x%10;
            reverse = reverse*10 + remainder;
            x /= 10;
        }
        if(first == reverse){
            return true;
        }
        else{
            return false;
        }
        }
    }