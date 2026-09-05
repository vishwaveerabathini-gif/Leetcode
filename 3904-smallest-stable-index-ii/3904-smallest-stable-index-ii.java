class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []mini=new int[nums.length];
        mini[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            mini[i]=Math.min(mini[i+1],nums[i]);
        }
        int max=nums[0];
        if((max-mini[0])<=k){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if((max-mini[i])<=k){
                return i;
            }
        }
        return -1;
    }
}