package insanevehicles.element.motionless;

import insanevehicles.element.Element;

public class MyVehicle extends Element {

	private int x, y;

	public MyVehicle() {
		super(' ');
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
