class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int p:nums) {
            set.add(p);
        }
        for (int i=k;;i+=k) {
            if (!set.contains(i)) {
                return i;
            }
        }
    }
}