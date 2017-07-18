package ch3.decorate;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "£¬ÄÌÅİ";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

}
