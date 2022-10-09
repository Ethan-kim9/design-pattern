package me.ethan.duck.behavior.fly.impl;

import me.ethan.duck.behavior.fly.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진을 통한 발사!! 부앙!");
    }
}
