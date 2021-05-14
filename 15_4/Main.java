public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < 10000; i++) {
		  //  バッファに"java"を追加
		    sb.append("Java");
		}
		System.out.println(sb);
	}
}