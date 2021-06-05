import java.util.*;

public class Subtraction extends Question {
    
    public int questionMake(int level) {
        int coefficient = (int) Math.pow(10, level-1);
        a = new Random().nextInt(9*coefficient);
        b = new Random().nextInt(9*coefficient);
        System.out.println("問題 " + this.a + " - " + this.b + " = ");
        System.out.println("解答を入力してください");
        return this.a - this.b;
    }
    public void levelSelect() {
        System.out.println("難易度を選択してください");
	    System.out.println("1 易");
	    System.out.println("2 中");
	    System.out.println("3 難");
    }
}
