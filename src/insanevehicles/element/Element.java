package insanevehicles.element;

public abstract class Element {
	
	private char sprite;

	public Element(char sprite) {
		this.sprite = sprite;
	}

	public char getSprite() {
		return sprite;
	}

	public void setSprite(char sprite) {
		this.sprite = sprite;
	}

}
