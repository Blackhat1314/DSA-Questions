// 1351. Count Negative Numbers in a Sorted Matrix
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Answer 

class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int negativeNum = 0;
        for(int i = 0;i<row;i++){
            if(grid[i][0]<0){
                negativeNum=negativeNum+col;
                continue;
            }
            if(grid[i][col-1]>0){
                continue;
            }
            int start=0;
            int end=col-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(grid[i][mid]>=0){
                    start = mid+1;
                }
                else if(grid[i][mid] <0){
                    negativeNum += end - mid+1;
                    end = mid-1;
                }
            } 
        }
        return negativeNum;
    }
    
}

