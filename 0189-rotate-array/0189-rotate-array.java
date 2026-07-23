class Solution {
    public void rotate(int[] ar, int k) {
        int n = ar.length;
        k = k%n;
        reverse(ar , 0 , n-1);
        reverse(ar , 0 , k-1);
        reverse(ar , k,  n-1);
    }
    public void reverse(int ar[] , int left , int right){
        while(left < right){
            int temp = ar[left]; 
            ar[left] = ar[right];
            ar[right] = temp;

            left ++;
            right --;
        }

    }
}