class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int z=0;
        int r=0;
        int[][] ans=new int[nums.length/3][3];
        ans[0][0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%3!=0){
                ans[r][i%3]=nums[i];
            }else{
                if((nums[i-1]-nums[i-3])>k){
                    int[][] arr=new int[0][0];
                    return arr;
                }
                r++;
                ans[r][i%3]=nums[i];
            }
        }
        if((nums[nums.length-1]-nums[nums.length-3])>k){
                int[][] arr=new int[0][0];
                return arr;
            }
        return ans;
    }
}