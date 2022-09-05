/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false



*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        int[] arr= new int[26];
        if(len<26){
            return false;
        }
        for(int i =0;i<len;i++){
            arr[sentence.charAt(i)-'a']++;
        }
        
        for(int k = 0;k<26;k++){
            if(arr[k]==0){
                return false;
            }
        }
        return true; 
    }
}
