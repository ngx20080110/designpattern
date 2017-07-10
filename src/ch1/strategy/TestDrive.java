package ch1.strategy;

import org.junit.Test;

public class TestDrive {

	@Test
	public void testQuack() {
		Duck duck = new RedheadDuck();
		duck.quack();
		
		duck = new MallardDuck();
		duck.quack();
	}
}
