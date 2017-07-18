package ch3.decorate;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Å¨Ëõ¿§·È";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
