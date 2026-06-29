// Title: Valid Sudoku
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/valid-sudoku/

class Solution {


    public boolean isValidSudoku(char[][] board) {
        //Set<Character> rows=new HashSet<>();
        //Set<Character> cols=new HashSet<>();
        //Set<Character> boxes=new HashSet<>();

        for(int i=0;i<9;i++){
            Set<Character> rows=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(rows.contains(board[i][j])){
                    return false;
                }
                rows.add(board[i][j]);
            }
        }

        for(int i=0;i<9;i++){
            Set<Character> cols=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(cols.contains(board[j][i])){
