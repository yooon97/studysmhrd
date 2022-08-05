package »ó¼Ó;

public class Main {

	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		
		m.right();
		m.drag();
		m.left();
		
		WheelMouse wm = new WheelMouse();
		wm.wheel();
		wm.left();
		wm.right();
		wm.drag();

	}
}
