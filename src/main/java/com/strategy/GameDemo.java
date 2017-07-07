package com.strategy;

/**设计模式一、策略模式
 *
 * Created by summe on 2017/7/3.
 */


public class GameDemo {

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();


    }

}
