class Solution {
    public int sumFourDivisors(int[] nums) {
        int t=0;
        for (int i=0;i<nums.length;i++) {
            int c=0;
            int s=0;
            for (int j=1; j*j<=nums[i];j++) {
                if (nums[i]%j == 0) {
                    c++;
                    s+=j;
                    if (j!= nums[i]/j) {
                        c++;
                        s+=nums[i]/j;
                    }
                }
                if (c>4) {
                    break;
                }
            }
            if (c==4) {
                t+=s;
            }
        }
        return t;
    }
}