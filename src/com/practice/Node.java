package com.practice;

/**
 * @Auther: liujiang
 * @Date: 2019/10/30
 * Description:
 * @version: 1.0
 */
public class Node {

    protected  Node next;
    protected  int data;
    public  Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
