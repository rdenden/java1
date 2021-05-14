public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
        h1.name = "ミナト";
        Hero h2 = new Hero();
        h2.name = "ミナト";
        h2.hp = 100;
        // 等価判定
        if (h1.equals(h2) == true) {
            System.out.println("等価判定　同じ内容です");
        } else {
            System.out.println("等価判定　違う内容です");
        }
        
        if (h1 == h2) {
            System.out.println("等値判定　同じ内容です");
        } else {
            System.out.println("等値判定　違う内容です");
        }
        
        Hero h3 = new Hero();
        h3.name = "ミナト";
        Hero h4 = h3;
        if (h3.equals(h4) == true) {
            System.out.println("等価判定　同じ内容です");
        } else {
            System.out.println("等価判定　違う内容です");
        }
        if (h3 == h4) {
            System.out.println("等値判定　同じ内容です");
        } else {
            System.out.println("等値判定　違う内容です");
        }
        
    }
}