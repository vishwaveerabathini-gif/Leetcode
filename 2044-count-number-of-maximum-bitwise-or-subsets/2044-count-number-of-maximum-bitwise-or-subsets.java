class Solution {
    static int count;
    public void check(int []nums,int i,int bit,int pre){
        if(pre==bit){
                count++;
            }
        for(int j=i;j<nums.length;j++){
            check(nums,j+1,bit,pre|nums[j]);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        count=0;
        int bit=0;
        for(int i=0;i<nums.length;i++){
            bit=(bit|nums[i]);
        }
        check(nums,0,bit,0);
        return count;
    }
}
// class Solution {
//     int count = 0;

//     public void check(int[] nums, int i, int bit, int pre) {

//         if (pre == bit) {
//             count++;
//         }

//         for (int j = i; j < nums.length; j++) {
//             check(nums, j + 1, bit, pre | nums[j]);
//         }
//     }

//     public int countMaxOrSubsets(int[] nums) {
//         count = 0;

//         int bit = 0;

//         for (int num : nums) {
//             bit |= num;
//         }

//         check(nums, 0, bit, 0);

//         return count;
//     }
// }