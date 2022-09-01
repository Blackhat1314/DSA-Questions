/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
eg- A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(char c : columnTitle.toCharArray()){
            result = result*26;
            result = result+(c-'A'+1);
        }
        return result;
        
    }
}
