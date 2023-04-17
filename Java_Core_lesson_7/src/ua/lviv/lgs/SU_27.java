package ua.lviv.lgs;

public class SU_27 extends Jet implements SpecialFunction {
	
	private int maxSpeed;
	private String color;
	
	private Jet_control jcontrol = new Jet_control();
	
	SU_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed=maxSpeed;
		this.color=color;
	}
	
	public void up() {
		jcontrol.move_up();
	}
	
	public void down() {
		jcontrol.move_down();
	}
	
	public void left() {
		jcontrol.move_left();
	}
	public void right() {
		jcontrol.move_right();
	}
	
	@Override
	public void turbo() {
		int turboSpeed = maxSpeed + (int)(Math.random()*100);

		System.out.println("Turbospeed on. Current speed " + turboSpeed+ " km/h");
		
	}

	@Override
	public void stealth() {
		int stealthTime = (int) (Math.random()*10);
		System.out.println("Stealth mode on " + stealthTime + " sec");
	}

	@Override
	public void nuclearAttack() {
	int bombDropped = (int)(Math.random() *10);
		System.out.println("Bombs dropped: "+bombDropped );
	}
}
