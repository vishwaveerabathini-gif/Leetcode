class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mini=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            if(min==nums[i]){
                mini=i;
            }
            if(max==nums[i]){
                maxi=i;
            }
        }
        if(nums.length==1){
            return 1;
        }
        int left=Math.max(mini,maxi)+1;
        int right=nums.length-Math.min(mini,maxi);
        int lr=Math.min(mini,maxi)+1+nums.length-Math.max(mini,maxi);
        return Math.min(left,Math.min(right,lr));
    }
}