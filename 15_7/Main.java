public class Main {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
// 		,:で分割
		String [] words = s.split("[,:]");
		for (String w : words) {
		    System.out.print(w + "->");
		}
	}
}