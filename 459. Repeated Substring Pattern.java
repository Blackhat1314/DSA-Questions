/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i= len/2; i>=1; i--){
            if(len%i==0){
                int count = len/i;
                String k = s.substring(0,i);
                StringBuilder sk =new StringBuilder();
                for(int l=0;l<count;l++){
                    sk.append(k);
                }
                if(sk.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
        
    }
}
