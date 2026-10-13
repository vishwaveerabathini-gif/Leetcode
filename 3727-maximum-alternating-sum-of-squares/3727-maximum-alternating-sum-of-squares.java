class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]*=(-1);
            }
        }
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        long count=0;
        while(s<e){
            long sq=(long)(nums[e]*nums[e]);
            long eq=(long)(nums[s]*nums[s]);
            s++;
            e--;
            count+=(sq-eq);
        }
        if(s==e){
            long f=(long)(nums[s]*nums[s]);
            count+=f;
        }
        return count;
    }
}