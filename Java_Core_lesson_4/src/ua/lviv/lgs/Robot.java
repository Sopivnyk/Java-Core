package ua.lviv.lgs;

public class Robot {

	private String robotName;
	private String working;

	Robot(String robotName, String working) {
		this.robotName = robotName;
		this.working = working;
	}
	
	Robot()
	{
		robotName = "Robot";
		working = "working";
	}

	public String work() {
		return "I'm " + robotName + ", i just " + working;

	}

	
}
