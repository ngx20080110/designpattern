package ch3.decorate;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "�����";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
