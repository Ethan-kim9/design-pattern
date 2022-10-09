package me.ethan.duck.origin;

import me.ethan.duck.behavior.fly.FlyBehavior;
import me.ethan.duck.behavior.quack.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;


    public Duck() {
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("다들 물에 뜨긴합니다. 가짜 오리도 떠요");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
