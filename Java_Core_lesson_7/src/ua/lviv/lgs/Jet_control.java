package ua.lviv.lgs;

public class Jet_control {

public void move_up () {
	int up = (int)(Math.random() * 10001);
	System.out.println("Jet moving up " + up +"m");
}
public void move_down () {
	int down = (int)(Math.random() * 10001);
	System.out.println("Jet moving down " + down +"m");

}

public void move_left () {
	int left = (int)(Math.random() * 10001);
	System.out.println("Jet moving left " + left +"m");

}
public void move_right () {
	int right = (int)(Math.random() * 10001);
	System.out.println("Jet moving right " + right +"m");

}

}