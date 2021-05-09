public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
	    thief.hp += 10;
	}
	public static void main(String[] args) {
	    int baseHp = 25;
	    Thief t = new Thief("アサカ", baseHp);
	    System.out.println(baseHp + ":" + t.hp);
	    heal(baseHp); // int型で渡すので値渡しとなり呼び出し元は影響なし
	    heal(t);　// インスタンス型で渡すと参照渡しとなり、呼び出し元も変化する
	    System.out.println(baseHp + ":" + t.hp);
	}
}