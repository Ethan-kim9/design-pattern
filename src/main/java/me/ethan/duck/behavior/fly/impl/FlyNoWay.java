package me.ethan.duck.behavior.fly.impl;

import me.ethan.duck.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지 못해요!");
    }
}
