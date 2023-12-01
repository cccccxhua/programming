package com.cxh.routine;

/**
 * @author CXH
 * @description
 * @create 2023-11-30 16:45
 */
public class SpiralMatrix2 {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int size = 1;
        int row = 0;
        int col = 0;
        while (size<n*n){
            //向右
            while (col+1<n && res[row][col+1]==0){
                res[row][col] = size;
                col++;
                size++;
            }
            //向下
            while (row+1<n && res[row+1][col]==0){
                res[row][col] = size;
                row++;
                size++;
            }
            //向左
            while (col-1>=0 && res[row][col-1]==0){
                res[row][col] = size;
                col--;
                size++;
            }
            //向上
            while (row-1>=0 && res[row-1][col]==0){
                res[row][col] = size;
                row--;
                size++;
            }
        }
        res[row][col] = size;
        return res;
    }
}
