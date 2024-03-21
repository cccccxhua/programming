package com.cxh.routine.programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2024-03-13 15:38
 */
public class NQueens {
    public static void main(String[] args) {

    }
    List<List<String>> ans = new LinkedList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessboard[i][j] = '.';
            }
        }
        backtracking(n, 0, chessboard);
        return ans;
    }
    public void backtracking(int n,int row,char[][] chessboard){
        if (row==n){
            //将满足条件的结果放入结果集
            List<String> tmp = new ArrayList<>();
            for (int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for (int j=0;j<n;j++){
                    sb.append(chessboard[i][j]);
                }
                tmp.add(sb.toString());
            }
            ans.add(tmp);
            return;
        }
        for (int i=0;i<n;i++){
            //判断这个位置能不能放
            if (isValid(row,i,chessboard)){
                chessboard[row][i] = 'Q';
                backtracking(n, row+1, chessboard);
                chessboard[row][i] = '.';
            }
        }
    }

    public boolean isValid(int row, int col, char[][] chessboard) {
        //因为在for循环中一行只能放一个，所以不用检查行
        //检查列
        for (int i=0;i<chessboard.length;i++){
            if (chessboard[i][col]=='Q'){
                return false;
            }
        }
        //检查45°斜线
        for (int i = row-1,j = col+1;i>=0 && j<chessboard.length;i--,j++){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        //检查135°斜线
        for (int i = row-1,j = col-1;i>=0 && j>=0;i--,j--){
            if (chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
