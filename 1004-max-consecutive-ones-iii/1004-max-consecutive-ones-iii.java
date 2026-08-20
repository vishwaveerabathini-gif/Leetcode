class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int count=0;
        int zeros=0;
        int z=0;
        while(zeros<k && z<nums.length){
            if(nums[z]==1){
                count++;
            }else{
                count++;
                zeros++;
            }
            z++;
        }
        int maxcount=count;
        for(int end=z;end<nums.length;end++){
            if(nums[end]==0){
                zeros++;
                while(zeros>k){
                    if(nums[start]==0){
                        zeros--;
                    }
                    count--;
                    start++;
                }
            }
            count++;
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}