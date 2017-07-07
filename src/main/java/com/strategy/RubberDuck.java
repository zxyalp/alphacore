package com.strategy;

/**
 * Created by yang.zhou on 2017/7/6.
 */
public class RubberDuck  extends Duck{

    public void quack(){
        System.out.println("会吱吱叫");
    }

    public void display() {
        System.out.println("this is RubberDuck.");
    }

    public void fly(){
        System.out.println("不会飞");
    }
}
