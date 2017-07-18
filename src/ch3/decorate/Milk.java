package ch3.decorate;

public class Milk extends CondimentDecorator {
	
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "£¬Å£ÄÌ";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

}
