class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start^goal;
        int flips = Integer.bitCount(xor);
        return flips;
    }
}