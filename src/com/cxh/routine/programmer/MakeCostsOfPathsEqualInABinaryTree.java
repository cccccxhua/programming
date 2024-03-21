package com.cxh.routine.programmer;

/**
 * @author CXH
 * @description
 * @create 2024-02-28 9:51
 */
public class MakeCostsOfPathsEqualInABinaryTree {
    public static void main(String[] args) {
        System.out.println(minIncrements(15, new int[]{764,1460,2664,764,2725,4556,5305,8829,5064,5929,7660,6321,4830,7055,3761}));

    }
    public static int minIncrements(int n, int[] cost) {
        int ans = 0;
        for (int i = n - 2; i > 0; i -= 2) {
            ans += Math.abs(cost[i] - cost[i + 1]);
            // 叶节点 i 和 i+1 的双亲节点下标为 i/2（整数除法）
            cost[i / 2] += Math.max(cost[i], cost[i + 1]);
        }
        return ans;
    }
}
