package insanevehicles;

import insanevehicles.element.Element;

public class Road {

	private int width, height, view, quota;
	private Element onTheRoad;

	public Road(int width, int height, int view, int quota) {
		this.width = width;
		this.height = height;
		this.view = view;
		this.quota = quota;
	}

	public void show(int yStart) {

	}

	private void fillOnTheRoad() {

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public Element getOnTheRoad(int x, int y) {
		return onTheRoad;
	}

	public void setOnTheRoad(Element onTheRoad, int x, int y) {
		this.onTheRoad = onTheRoad;
	}

}
