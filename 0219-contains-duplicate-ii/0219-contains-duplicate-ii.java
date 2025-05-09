class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> co =new HashSet<>();
        for(int i =0;i<nums.length;i++){
          if(co.contains(nums[i]))
            return true;
          co.add(nums[i]);
          if(co.size()>k)
            co.remove(nums[i-k]);
        }
      return false;
    }
   
}