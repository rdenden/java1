public class Main {
	public static void main(String[] args) {　
	   // 各キャラクターをcharacterとして配列化
		Character[] c = new Character[5];
		c[0] = new Hero;
		c[1] = new Hero;
		c[2] = new Thief;
		c[3] = new Wizard;
		c[4] = new Wizard;
		for (character ch: c) {
		    ch.hp += 50;
		}
		
	}
}