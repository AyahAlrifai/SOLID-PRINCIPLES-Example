package duck;

import duck.flyBehavior.FlyRocketPowered;
import duck.quackBehavior.Squeak;
import duck.type.*;

public class Main {
	public static void main(String[] args) {
		Duck decoy=new DecoyDuck();
		printInfo(decoy);
		decoy.setFlyBehavior(new FlyRocketPowered());
		printInfo(decoy);

		Duck mallard=new MallardDuck();
		printInfo(mallard);
		mallard.setQuackBehavior(new Squeak());
		printInfo(mallard);

		Duck model=new ModelDuck();
		Duck readHead=new RedHeadDuck();
		printInfo(model);
		printInfo(readHead);
		
	}
	
	public static void printInfo(Duck duck) {
		duck.display();
		duck.performQuack();
		duck.performFly();
		duck.performDive();
		System.out.println("<--------------------------->");
	}
}
