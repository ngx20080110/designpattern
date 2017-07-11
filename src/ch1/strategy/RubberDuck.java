package ch1.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("ÎÒÊÇÏğÆ¤Ñ¼");
	}
}
