class Solution {
    public int search(int[] ar, int target) {
        int left = 0;
        int right = ar.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(ar[mid] == target){
                return mid;
            }
            if(ar[left] <= ar[mid]){
                if(target >= ar[left] && target < ar[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                 if(target > ar[mid] && target <= ar[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}