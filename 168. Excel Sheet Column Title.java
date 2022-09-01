/* 
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 eg - A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28

*/


class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        int n = columnNumber;
        while(n>0){
            char c = (char)('A'+(n-1)%26);
            result = c +result;
            n = (n-1)/26;
        }
        return result;
    }
}
