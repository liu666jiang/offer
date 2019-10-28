package com.practice;

/**
 * @Auther: liujiang
 * @Date: 2019/10/28
 * Description:16.数值的整数次方
 * 描述：给定一个 double 类型的浮点数 base
 * 和int类型的整数 exponent，求base的exponent次方。
 * @version: 1.0
 */
public class Power {
    public static double Pow(double base,int exponent){
        //任何数的0次方都是1
        if (exponent==0){
            return 1;
        }
        //根号x^2等于x
        if(exponent==1){
            return base;
        }
        //小于0，进行处理
        boolean  isNegative = false;
        if (exponent<0){
           exponent=-exponent;
           isNegative=true;
        }
        //递归调用求解
        double num=Pow(base*base,exponent/2);
        if (exponent!=0)
            num=base*num;
        return isNegative?1/num:num;
    }

    public static void main(String[] args) {
        double it=  Pow(2,3);
        System.out.println(it);
    }
}
