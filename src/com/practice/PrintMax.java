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

    public static void  printToMaxOfNDigits_Method2(int n){
        if (n<0){
            return;
        }
        //初始化字符串为0
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<n;i++){
            stringBuilder.append("0");
        }
        //当数不溢出的时候，自增打印
        while(!increase(stringBuilder)){
            print(stringBuilder);
        }
    }
    private static boolean increase(StringBuilder stringBuilder) {
        //设置溢出标志位
        boolean isTakeFlow=false;
        Integer nTakeOver=0;
        int sLength=stringBuilder.length();
        for (int i=sLength-1;i>=0;i--){
            int nSum=stringBuilder.charAt(i)-'0'+nTakeOver;
            //个位数时加一就行
            if (i==sLength-1){
                nSum++;
            }
            //满十进一
            if (nSum>=10){
                //判断是不是最大位
                if (i==0){
                    //溢出
                    isTakeFlow=true;
                }else{//不是最大位
                    nSum=nSum-10;
                    nTakeOver=1;
                    stringBuilder.setCharAt(i,(char)('0'+nSum));
                }
            }else{
                stringBuilder.setCharAt(i,(char)('0'+nSum));
                break;
            }
        }
        return  isTakeFlow;
    }
    //打印字符串
    public static void print(StringBuilder stringBuilder) {
        boolean isBeginZero = true;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (isBeginZero && stringBuilder.charAt(i) != '0') {
                isBeginZero = false;
            }
            if (!isBeginZero) {
                System.out.print(stringBuilder.charAt(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printToMaxOfNDigits_Method2(2);
    }
}
