package ch3.decorate;

import org.junit.Test;

public class StarbuzzCoffee {

	@Test
	public void test() {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(new Mocha(beverage3));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
