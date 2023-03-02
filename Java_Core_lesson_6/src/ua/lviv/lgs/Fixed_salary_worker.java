package ua.lviv.lgs;

public class Fixed_salary_worker implements Salary {
	

	public double salary (double day_rate, double days) {
		return day_rate * days;

	}

}
