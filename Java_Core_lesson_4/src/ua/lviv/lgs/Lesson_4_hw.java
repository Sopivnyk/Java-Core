package ua.lviv.lgs;

public class Lesson_4_hw {

	public static void main(String[] args) {

		Robot firstrobot = new Robot();
		CoffeRobot cofferobot = new CoffeRobot();
		RobotDancer robotdancer = new RobotDancer();
		RobotCoocker robotcoocker = new RobotCoocker();

		Robot[] robots = { firstrobot, cofferobot, robotdancer, robotcoocker };
		for (int i = 0; i < robots.length; i++) {
			Robot robot = robots[i];

			System.out.println(robot.work());

		}

		Animal anim = new Animal(null, 0, 0);

		System.out.println(anim);

		anim.setName("Behemoth");
		anim.setAge(15);
		anim.setSpeed(5.80);

		System.out.println(anim);

	}

}
