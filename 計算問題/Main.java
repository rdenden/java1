import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Introduction i = new Introduction();
	    i.questionSelect();
	    Question q1;
	    int questionSelectNumber;
	    while (true) {
	        questionSelectNumber = sc.nextInt();
	        if (questionSelectNumber == 1) {
	            q1 = (Addition)new Addition();
	            break;
	        } else if (questionSelectNumber == 2) {
	            q1 = (Subtraction)new Subtraction();
	            break;
	        } else {
	            System.out.println("入力した値が正しくありません");
	            System.out.println("選択肢の番号を入力してください");
	        }
	    }
	    
	    
	    
	    q1.levelSelect();
	    int levelSelectNumber = sc.nextInt();
	   // QuestionMaker question1 = new QuestionMaker(questionSelectNumber,levelSelectNumber)
	    
	}
}