import java.util.*;

public class Subtraction implements Question {
    int a = new Random().nextInt(9);
    int b = new Random().nextInt(9);
    public void questionIndicate() {
        System.out.println(this.a + "-" + this.b);
    }
    public void levelSelect() {
        System.out.println("難易度を選択してください");
	    System.out.println("1 易");
	    System.out.println("2 中");
	    System.out.println("3 難");
    }
}