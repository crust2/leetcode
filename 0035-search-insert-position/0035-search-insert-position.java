class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for( int i=n-1;i>=0;i--){
            if(nums[i]==target){
                return i;
            }if(nums[i]<target){
                return i+1;
            }
        }
        return 0;
    
    }
}