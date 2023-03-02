package ua.lviv.lgs_interface_2;

import ua.lviv.lgs_interface_1.Numerable;

public class My_Calculator implements Numerable {

	public double plus(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		return a - b;
	}

	public double add(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;

	}

	public static void main(String[] args) {

		double a = 18.4;
		double b = 54.8;

		My_Calculator calc = new My_Calculator();

		System.out.println(calc.plus(a, b));
		System.out.println(calc.minus(a, b));
		System.out.println(calc.add(a, b));
		System.out.println(calc.divide(a, b));

	}
}
