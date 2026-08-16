class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        if(nums[0]!=0){
            return 0;
        }
        for( int k=0;k<n-1;k++){
            if(nums[k+1]!=nums[k]+1){
                return nums[k]+1;
            }
        }
        return n;
    }
}