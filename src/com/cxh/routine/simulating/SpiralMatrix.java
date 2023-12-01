package com.cxh.routine.simulating;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-11-30 10:17
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = 0;//记录当前行数
        int col = 0;//记录当前列数
        int m = matrix.length;//矩阵的行数
        int n = matrix[0].length;//矩阵的列数
        int num = 0;
        List<Integer> res = new ArrayList<>();
        while (num<m*n-1){
            //向右
            while (col+1<n && matrix[row][col+1]!=101){
                res.add(matrix[row][col]);
                matrix[row][col]=101;
                col++;
                num++;
            }
            //向下
            while (row+1<m && matrix[row+1][col]!=101){
                res.add(matrix[row][col]);
                matrix[row][col]=101;
                row++;
                num++;
            }
            //向左
            while (col-1>=0 && matrix[row][col-1]!=101){
                res.add(matrix[row][col]);
                matrix[row][col]=101;
                col--;
                num++;
            }
            //向上
            while (row-1>=0 && matrix[row-1][col]!=101){
                res.add(matrix[row][col]);
                matrix[row][col]=101;
                row--;
                num++;
            }

        }
        res.add(matrix[row][col]);
        return res;
    }
}
