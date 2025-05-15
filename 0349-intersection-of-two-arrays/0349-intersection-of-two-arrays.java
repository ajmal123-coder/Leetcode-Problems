class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> interset = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            if(set1.contains(nums2[i]))
                interset.add(nums2[i]);
        }
        int[] res = new int[interset.size()];
        int i = 0;
        for(int k:interset)
            res[i++] = k;
        return res;
    }
}