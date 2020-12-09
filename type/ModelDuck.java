package duck.type;

import duck.diveBehavior.DiveDuck;
import duck.diveBehavior.DiveNoWay;
import duck.flyBehavior.FlyNoWay;
import duck.quackBehavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
		setDiveBehavior(new DiveNoWay());

	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
