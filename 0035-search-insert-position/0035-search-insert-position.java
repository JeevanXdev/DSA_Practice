class Solution {
    public int searchInsert(int[] ar, int target) {
        int n = ar.length;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(ar[mid] == target){
                return mid;
            }
            else if(ar[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}