package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		SU_27 su27_jet = new SU_27(21900, 14700, 23000, 2500, "pixel paint");
		
		su27_jet.startEngine();
		su27_jet.up();
		su27_jet.down();
		su27_jet.left();
		su27_jet.right();
		su27_jet.stealth();
		su27_jet.nuclearAttack();
		su27_jet.turbo();
		su27_jet.planeLanding();
		

	}

}
