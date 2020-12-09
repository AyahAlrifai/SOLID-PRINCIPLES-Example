package duck.diveBehavior;

public class DiveNoWay implements DiveBehavior{

	@Override
	public void dive() {
		System.out.println("I can't dive");		
	}

}
