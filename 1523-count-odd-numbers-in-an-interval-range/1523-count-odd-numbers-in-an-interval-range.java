class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}

/// no. of odds btw a range = (h+1)/2 - l/2;