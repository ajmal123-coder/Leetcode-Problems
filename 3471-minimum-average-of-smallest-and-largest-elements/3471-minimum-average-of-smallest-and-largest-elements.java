import java.util.*;
class Solution {
    public double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        double averagemin = Double.MAX_VALUE;
        int right = nums.length-1;
        int left = 0;
        while( left < right){
            double average = (nums[left] + nums[right])/2.0;
            averagemin = Math.min(averagemin,average);
            left++;
            right--;
        }
     return averagemin;
    }
}