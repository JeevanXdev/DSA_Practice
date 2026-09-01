class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt = 0;
        int flips = start ^ goal;
        cnt = Integer.bitCount(flips);

        return cnt;
    }
}