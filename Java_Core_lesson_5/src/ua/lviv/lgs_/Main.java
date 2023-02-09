package ua.lviv.lgs_;

public class Main {

	public static void main(String[] args) {
		
		Frog f = new Frog();
		Amphibia a = f;
		a.eat();
		a.sleep();
		a.swim();
		a.walk();

	}

}
