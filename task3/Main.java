package lession5_2;

public class Main {
	public static void main(String[] args) {
		Frog shark = new Frog("predator");
		Amphibia fish = shark; // і так сойдет
		
		System.out.println(fish);
		
		fish.eat();
		fish.sleep();
		fish.walk();
		fish.swin();
	}
	// десь 30 хв не міг зрозуміти чому не наслідуються дочірні класи батьківському
	// поки не побачив що немає public static void main(String[] args)! це жесть!
}
