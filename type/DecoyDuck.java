package duck.type;

import duck.diveBehavior.DiveDuck;
import duck.flyBehavior.FlyNoWay;
import duck.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
		setDiveBehavior(new DiveDuck());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
