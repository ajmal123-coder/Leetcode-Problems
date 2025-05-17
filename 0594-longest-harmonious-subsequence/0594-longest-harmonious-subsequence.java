class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> fr = new HashMap<>();
        for(int num : nums){
            fr.put(num,fr.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(int num : fr.keySet()){
            if(fr.containsKey(num+1)){
                int current = fr.get(num)+fr.get(num+1);
                max = Math.max(max,current);
            }
        }
        return max;
    }
}