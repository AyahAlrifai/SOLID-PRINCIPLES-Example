package duck.type;

import duck.diveBehavior.DiveDuck;
import duck.flyBehavior.FlyWithWings;
import duck.quackBehavior.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
		setDiveBehavior(new DiveDuck());
	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
