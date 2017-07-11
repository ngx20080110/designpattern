package ch1.strategy;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("²»»á½Ð");
	}

}
