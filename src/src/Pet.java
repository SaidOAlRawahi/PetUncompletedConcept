package src;

public abstract class Pet {
	String name;
	
	void makeSound() {
		System.out.print(name+" goes: ");
	}
	 void move() {
		System.out.print(name + " ");
	 }
	 void eat() {
		System.out.print(name + " is eating ");
	 }
}

class Dog extends Pet{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("woof woof woof");
	}
	@Override
	 void move() {
		super.move();
		System.out.println("sits and stands and rolls");
	 }
	@Override
	 void eat() {
		super.eat();
		 System.out.print("a bone");
	 }
}

class Cat extends Pet{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("meow meow");
	}
	@Override
	 void move() {
		super.move();
		System.out.println("sleeps and walks and climbs");
	 }
	@Override
	 void eat() {
		super.eat();
		 System.out.print("a fish");
	 }
}

class Bird extends Pet{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("quack quack");
	}
	@Override
	 void move() {
		super.move();
		System.out.println("flys and hops");
	 }
	@Override
	 void eat() {
		super.eat();
		 System.out.print(" beans");
	 }
}

class Horse extends Pet{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Huhihehuh Huhihehuh");
	}
	@Override
	 void move() {
		super.move();
		System.out.println("runs and jogs and jumbs");
	 }
	@Override
	 void eat() {
		super.eat();
		 System.out.print(" grass");
	 }
}

class RobotPet extends Pet{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("H e e l l l o o o o  W w o o o o r l d");
	}
	@Override
	 void move() {
		super.move();
		System.out.println("dances and rolls and charges");
	 }
	@Override
	 void eat() {
		super.eat();
		 System.out.print(" Oil");
	 }
}
