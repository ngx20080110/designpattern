package ch1.strategy;

public abstract class Duck {
	
	public void quack() {
		System.out.println("Quack");
	}
	
	public void swim() {
		System.out.println("Swin");
	}
	
	public abstract void display();
}
