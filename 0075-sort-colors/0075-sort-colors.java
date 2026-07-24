class Solution {
    public void sortColors(int[] ar) {
        int n = ar.length;
        int low = 0; int mid = 0; int high = n-1;
        while(mid<=high){
            if(ar[mid] == 0){
                swap(ar , low , mid);
                low++;
                mid++;
            }
            else if(ar[mid] == 1){
                mid++;
            }
            else{
                swap(ar , mid ,high);
                high --;
            }
        }
    }
    public static void swap(int ar[] , int left , int right){
        while(left<right){
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            left ++;
            right --;
        }
    }
}