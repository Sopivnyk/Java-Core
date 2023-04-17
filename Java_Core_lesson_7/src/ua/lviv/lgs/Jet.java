package ua.lviv.lgs;

public abstract class Jet {
	
	private int length;
	private int width;
	private int weight;
	
	Jet (int length, int width, int weight){
		this.length=length;
		this.width=width;
		this.weight=weight;
	}
	
	
	int time = (int)  (20 + Math.random()*(88-20));
	double fly = Math.random()*1000;
	public void startEngine() {
		System.out.println("Engine starts " + time + " sec");
	}
	public void planeBlastOff() {
		System.out.println("Plane flying. Fuel " + fly + " km");
	}
	public void planeLanding() {
		System.out.println("Plane get landing");
	}

}

