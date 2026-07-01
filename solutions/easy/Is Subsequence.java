// Title: Is Subsequence
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, 
    String t) {
        char[] ca=s.toCharArray();
        int j=0;
        for(int i=0;i<t.length() && j<s.length
            if(t.charAt(i)==s.charAt(j)){
        }
        return j==s.length();
                j++;
            }
    }
        ();i++){
}
