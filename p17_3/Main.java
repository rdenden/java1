public class Main {
	public static void main(String[] args) {
		try {
		    int num = Integer.parseInt("三");
		} catch (NumberFormatException e) {
		    System.out.println("NumberFormatException例外をcatchしました");
		    
		}
		
	}
}