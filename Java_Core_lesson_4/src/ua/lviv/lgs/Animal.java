package ua.lviv.lgs;

public class Animal {

	private String name;
	private int age;
	private double speed;

	Animal(String name, int age, double speed) {
		this.name = "Lion";
		this.speed = 35.1;
		this.age = 8;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "animal name = " + name + ", animal age = " + age + ", animal speed = " + speed + "km/h";
	}

}
