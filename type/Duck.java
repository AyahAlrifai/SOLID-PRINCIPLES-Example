package duck.type;
import duck.diveBehavior.DiveBehavior;
import duck.flyBehavior.*;
import duck.quackBehavior.*;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	private DiveBehavior diveBehavior;
 
	public Duck() {
		
	}
 
	public void setFlyBehavior (FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
 
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void setDiveBehavior(DiveBehavior diveBehavior) {
		this.diveBehavior = diveBehavior;
	}

	public abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performDive() {
		diveBehavior.dive();
	}
}
