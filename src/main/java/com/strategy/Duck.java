package com.strategy;

/**模型超类
 * Created by yang.zhou on 2017/7/6.
 */
abstract class Duck {

    public void quack(){
        System.out.print("gua...gua...gua");
    }

    public void swim(){
        System.out.print("swimming...");
    }

    public abstract void display();

}
