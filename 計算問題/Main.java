import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Introduction i = new Introduction();
	    i.questionSelect();
	    int questionSelectNumber = sc.nextInt();
	    i.levelSelect();
	    int levelSelectNumber = sc.nextInt();
	    if (questionSelectNumber == 1) {
	        Addition q1 = new Addition();
	        q1.question();
	    } 
	}
}