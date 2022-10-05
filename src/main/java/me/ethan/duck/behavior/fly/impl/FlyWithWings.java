package me.ethan.duck.behavior.fly.impl;

import me.ethan.duck.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날아요 날아");
    }
}
