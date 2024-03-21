package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-03-13 16:46
 */
public class SudokuSolver {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    public boolean backtracking(char[][] board){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j] != '.'){
                    continue;
                }
                for (char num = '1';num<='9';num++){
                    if (isValid(i,j,num,board)){
                        board[i][j] = num;
                        if (backtracking(board)){
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    public boolean isValid(int row, int col, char num, char[][] board) {
        //查看行
        for(int i=0;i<9;i++){
            if (board[row][i] == num){
                return false;
            }
        }
        //查看列
        for (int i=0;i<9;i++){
            if (board[i][col] == num){
                return false;
            }
        }
        //查看3*3sub box
        int start = row/3 * 3;//计算所属方块
        int end = col/3 * 3;//计算所属方块
        for (int i=start;i<start+3;i++){
            for (int j=end;j<end+3;j++){
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
