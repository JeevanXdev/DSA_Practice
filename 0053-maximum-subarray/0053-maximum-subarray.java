class Solution {
    public int maxSubArray(int[] ar) {
        int n = ar.length;
        int sum = 0;
        int maxx = Integer.MIN_VALUE;
        for(int i =0; i<ar.length; i++){
            sum += ar[i];
            if(sum>maxx){
                maxx = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }
        return maxx;
    }
}