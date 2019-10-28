package com.practice;

/**
 * @Auther: liujiang
 * @Date: 2019/10/28
 * Description: 打印1到最大的n位数
 * @version: 1.0
 */
public class PrintMax {
     //暴力解法:
    //缺点：整形溢出问题，代码的鲁棒性很差
    public static void printToMaxOfNDigits(int n){
        int i=0;
        int number=1;
        //首先计算出最大十进制位数
        while(i<n){
          number=number*10;
          ++i;
        }
        //循环输出
        for (int j=1;j<number;j++){
            System.out.print(j+"   ");
            if (j%5==0)
                System.out.println();
        }
    }
    public static void main(String[] args) {
        printToMaxOfNDigits(2);
    }
}
