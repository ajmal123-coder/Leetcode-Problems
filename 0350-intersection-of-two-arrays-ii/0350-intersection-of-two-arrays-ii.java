class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int num1le = nums1.length;
        int num2le = nums2.length;
        int i=0,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<num1le && j<num2le){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                nums1[k++] =nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}