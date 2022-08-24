// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0;i<row;i++){
            if(matrix[i][col-1]<target){
                continue;
            }
            int start = 0;
            int end = col-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(matrix[i][mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return false;
    }
}
