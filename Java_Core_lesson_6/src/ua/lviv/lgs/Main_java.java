package ua.lviv.lgs;

public class Main_java {

	public static void main(String[] args) {

		Fixed_salary_worker fixed = new Fixed_salary_worker();
		Hourly_salary_worker hourly = new Hourly_salary_worker();
		
		System.out.println("Fixed salary worker " + fixed.salary(100.5, 24) + " $/month");
		System.out.println("Hourly salary worker " + hourly.salary(12.5, 8)*24 + " $/month");

	}

}
