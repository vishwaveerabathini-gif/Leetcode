class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int start=0;
        int z=0;
        int idx=0;
        while(idx<nums.length){
            if(nums[idx]==0){
                z++;
                if(z>1){
                    z--;
                    break;
                }
            }else{
                count++;
            }
            idx++;
        }
        int max=count;
        for(int end=idx;end<nums.length;end++){
            if(nums[end]==0){
                z++;
            }
            else{
                count++;
            }
            if(z>1){
                max=Math.max(count,max);
                while(z>1){
                    if(nums[start]==0){
                        z--;
                    }else{
                        count--;
                    }
                    start++;
                }
            }
        }
        max=Math.max(count,max);
        if(max==nums.length){
            return max-1;
        }
        return max;
    }
}