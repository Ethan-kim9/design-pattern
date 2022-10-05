package me.ethan.duck;

import me.ethan.duck.origin.Duck;
import me.ethan.duck.species.MallardDuck;
import me.ethan.duck.species.RubberDuck;

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
    }
}
