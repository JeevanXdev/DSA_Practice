class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        if (first == -1){
            return new int[]{-1,-1};
        }
        int last = findLast(nums,target);
        return new int[]{first,last};
    }
    public int findFirst(int nums[] , int target){
        int left =0;
        int right = nums.length-1;
        int firstPos = -1;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                firstPos = mid;
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return firstPos;
    }
    public int findLast(int nums[],int target){
        int left = 0;
        int right = nums.length-1;
        int lastPos = -1;
        
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                lastPos = mid;
                left = mid+1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return lastPos;
    }
}