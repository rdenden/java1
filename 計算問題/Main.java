import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Introduction i = new Introduction();
	    i.questionSelect();
	   
	    int questionSelectNumber;
	    Addition a1 = new Addition();
	    Subtraction s1 = new Subtraction();
	    while (true) {
	        questionSelectNumber = sc.nextInt();
	        if (questionSelectNumber == 1) {
	            break;
	        } else if (questionSelectNumber == 2) {
	            break;
	        } else {
	            System.out.println("入力した値が正しくありません");
	            System.out.println("選択肢の番号を入力してください");
	        }
	    }
	    
	    
	    if (questionSelectNumber == 1) {
	        a1.levelSelect();
	        int levelSelectNumber = sc.nextInt();
	        int correct = a1.questionMake(levelSelectNumber);
	        int answer = sc.nextInt();
	        if (correct == answer) {
	            System.out.println("正解！");
	        } else {
	            System.out.println("不正解。");
	            System.out.println("正解は" + correct + "です。");
	        }
	    }
	    if (questionSelectNumber == 2) {
	        s1.levelSelect();
	        int levelSelectNumber = sc.nextInt();
	        int correct = s1.questionMake(levelSelectNumber);
	        int answer = sc.nextInt();
	        if (correct == answer) {
	            System.out.println("正解！");
	        } else {
	            System.out.println("不正解。");
	            System.out.println("正解は" + correct + "です。");
	        }
	    }
	}
}