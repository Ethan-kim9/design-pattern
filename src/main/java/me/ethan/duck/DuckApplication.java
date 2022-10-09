package me.ethan.duck;

import me.ethan.duck.behavior.fly.impl.FlyWithRocket;
import me.ethan.duck.origin.Duck;
import me.ethan.duck.species.MallardDuck;
import me.ethan.duck.species.RubberDuck;
import me.ethan.duck.species.SecretDuck;

public class DuckApplication {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.display();

        System.out.println("--------------");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();
        rubberDuck.display();

        System.out.println("--------------");
        Duck secretDuck = new SecretDuck();
        secretDuck.performQuack();
        secretDuck.performFly();
        secretDuck.swim();
        secretDuck.display();
        secretDuck.setFlyBehavior(new FlyWithRocket());
        secretDuck.performFly();
    }
}