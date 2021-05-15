public class Main {
	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT,"minato","hero",280);
		String s1 = String.format(FORMAT,"asaka","witch",32000);
		System.out.println(s);
		System.out.println(s1);
		String s2 = "10000";
		System.out.printf("%,-12d",10000);
		System.out.println();
		System.out.printf("製品番号%s-%02d","SVC",3);
	}
}