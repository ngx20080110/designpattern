package ch1.strategy;

import org.junit.Test;

public class TestDrive {

	@Test
	public void testQuack() {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		System.out.println("-----------");
		
		duck = new RubberDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		System.out.println("-----------");
		
		duck = new ModelDuck();
		duck.display();
		duck.performQuack();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
