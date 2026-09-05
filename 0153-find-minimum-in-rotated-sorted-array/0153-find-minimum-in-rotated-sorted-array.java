class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[0];
    }
}