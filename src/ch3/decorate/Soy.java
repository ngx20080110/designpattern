package ch3.decorate;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "£¬¶¹½¬";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
