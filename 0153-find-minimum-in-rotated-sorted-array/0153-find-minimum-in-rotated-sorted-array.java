class Solution {
    public int findMin(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[0];
    }
}