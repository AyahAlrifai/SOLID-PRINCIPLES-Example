package duck.type;

import duck.diveBehavior.DiveNoWay;
import duck.flyBehavior.FlyWithWings;
import duck.quackBehavior.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
		setDiveBehavior(new DiveNoWay());
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
