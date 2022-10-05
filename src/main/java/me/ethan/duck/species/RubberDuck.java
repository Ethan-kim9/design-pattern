package me.ethan.duck.species;

import me.ethan.duck.behavior.fly.impl.FlyNoWay;
import me.ethan.duck.behavior.quack.impl.MuteQuack;
import me.ethan.duck.origin.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("러버덕입니다. 뜨는 것 말곤 암것도 못해유");
    }
}
