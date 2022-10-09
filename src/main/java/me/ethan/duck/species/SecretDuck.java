package me.ethan.duck.species;

import me.ethan.duck.behavior.fly.impl.FlyNoWay;
import me.ethan.duck.behavior.quack.impl.MuteQuack;
import me.ethan.duck.origin.Duck;


public class SecretDuck extends Duck {


    public SecretDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("비밀의 오리입니다.");
    }
}
