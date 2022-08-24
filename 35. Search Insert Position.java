//  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Input: nums = [1,3,5,6], target = 7
// Output: 4

// Code Here ******************* \\

class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int found = 0;
        if(nums[len-1]<target){
            return len;
        }
        int start = 0;
        int end=len-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end= mid-1;
            }
            else{
                start = mid+1;
            }  
        }
         for(int i =0;i<len;i++){
            if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }
        }
        return found;
    }
}
