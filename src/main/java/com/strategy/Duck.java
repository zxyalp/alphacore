package com.strategy;

/**模型超类
 * Created by yang.zhou on 2017/7/6.
 */
abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;


    public void performQuack(){
        quackBehavior.quack();
    }


    public void performFly(){
        flyBehavior.fly();
    }


    public void swim(){
        System.out.println("鸭子会游泳");
    }


    public abstract void display();

}
