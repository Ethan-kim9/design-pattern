package me.ethan.duck.species;

import me.ethan.duck.behavior.fly.impl.FlyNoWay;
import me.ethan.duck.behavior.fly.impl.FlyWithWings;
import me.ethan.duck.behavior.quack.impl.Quack;
import me.ethan.duck.origin.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("물오리 입니다.");
    }
}
