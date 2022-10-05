package me.ethan.duck.behavior.quack.impl;

import me.ethan.duck.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<조용조용>>");
    }
}
