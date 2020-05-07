package lession5_2;

public class Amphibia {
	private String type;

	public Amphibia(String type) {
		this.type = type;
	}

	public void eat() {
		System.out.println("eating");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public void swin() {
		System.out.println("switing");
	}

	public void walk() {
		System.out.println("walking");
	}

	@Override
	public String toString() {
		return "Amphibia [type=" + type + "]";
	}

}
