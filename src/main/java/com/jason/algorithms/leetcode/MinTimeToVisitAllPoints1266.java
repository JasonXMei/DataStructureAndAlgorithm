package com.jason.algorithms.leetcode;

/*
leetcode 1266
平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。

 你可以按照下面的规则在平面上移动：

 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 必须按照数组中出现的顺序来访问这些点。

 示例：
 输入：points = [[1,1],[3,4],[-1,0]]
输出：7
解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
从 [1,1] 到 [3,4] 需要 3 秒
从 [3,4] 到 [-1,0] 需要 4 秒
一共需要 7 秒

 *  @author JasonMei
 *  @date 2021-05-19
*/
public class MinTimeToVisitAllPoints1266 {

    /**
     * 主要考虑相邻两点之间，求取x轴距离和y轴距离的最大绝对值即可
     */
    public static int method1(int[][] points){
        int answer = 0;
        for(int i = points.length - 1;i >= 1;i--){
            answer += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
        }
        return answer;
    }
}
