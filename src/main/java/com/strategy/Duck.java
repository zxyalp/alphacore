package com.strategy;

/**模型超类
 * Created by yang.zhou on 2017/7/6.
 */
abstract class Duck {

    public void quack(){
        System.out.print("会呱呱叫");
    }

    public void swim(){
        System.out.println("会游泳");
    }

    public void fly(){
        System.out.println("会飞了");
    }

    public abstract void display();

}
