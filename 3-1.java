public class Main {
	public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {　//かっこ省略不可（二行だから）
            System.out.println("洗濯します");
            System.out.println("散歩に行きます")
        } else {　// かっこ省略可
            System.out.println("DVDを見ます");
        }
	}
}