public class Main {
	public static void main(String[] args) {
		String s1 = "すっきりJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
		    System.out.println("s2とs3は等しい");
		}
	    if (s2.equalsIgnoreCase(s3)) {
	        System.out.println("s2とs2はケースを区別しなければ等しい");
	    }
	    System.out.println("s1の長さは" + s1.length() + "です");
	}
}