package com.practice;

/**
 * @Auther: liujiang
 * @Date: 2019/10/28
 * Description:剑指offer
 * 15:二进制中 1 的个数
 * @version: 1.0
 */
public class bigCount {

    /**
     * 主要分析n&(n-1)的妙用：
     * 假如二进制n,最后一位是0,就向前借一位2。2-1=1，假如是1，
     * 向前借一位变成2，加上本身少一变成1。直到遇到1，变成0.
     * 例子：
     * 按照上述 n=xxxx10000，n-1=xxxx01111
     *   xxxx10000
     *   xxxx01111
     *   xxxx0000
     * 可以看到原来二进制的最右边的1变成0了，有多少1就循环多少遍。
     * @param n
     * @return
     */
    public static int Count(int n){
        int sum=0;
        while(n!=0){
            sum++;
           n&=n-1;
        }
        return  sum;
    }
    public static void main(String[] args) {
        int num=Count(7);
        System.out.println(num);
    }
}
