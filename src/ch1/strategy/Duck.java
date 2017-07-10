package ch1.strategy;

public abstract class Duck {
	
	public void quack() {
		System.out.println("Quack");
	}
	
	public void swim() {
		System.out.println("Swin");
	}
	
	public void fly() {
		System.out.println("Fly");
	}
	
	public abstract void display();
}
