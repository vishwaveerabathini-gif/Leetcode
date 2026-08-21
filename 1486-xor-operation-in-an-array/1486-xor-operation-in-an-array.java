class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int sum=0;
        nums[0]=start;
        for(int i=1;i<nums.length;i++){
            nums[i]=start+(2*i);
            nums[i]=(nums[i-1]^nums[i]);
        }
        return nums[nums.length-1];
    }
}