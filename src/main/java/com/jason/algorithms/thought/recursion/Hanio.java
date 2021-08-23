package com.jason.algorithms.thought.recursion;

/**
 * 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着 64 片黄金圆盘。
 * 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上，并且规定，在小圆盘上不能放大圆盘，
 * 在三根柱子之间一次只能移动一个圆盘。
 *
 * @author JasonMei
 * @date 2021-05-20
 */
public class Hanio {

    public static void main(String[] args) {
        hanio(3, "x", "y", "z");
    }

    /**
     * 把从小到大的 n-1 个盘子，从 x 移动到 y；
     * 接着把最大的一个盘子，从 x 移动到 z；
     * 再把从小到大的 n-1 个盘子，从 y 移动到 z。
     */
    public static void hanio(int n, String x, String y, String z){
        if(n < 0){
            System.out.println("汉诺塔层数不能小于0");
            return;
        }

        if(n == 1){
            System.out.println("移动: " + x + " -> " + z);
            return;
        }

        hanio(n - 1, x, z, y);
        System.out.println("移动: " + x + " -> " + z);
        hanio(n - 1, y, x, z);
    }
}
