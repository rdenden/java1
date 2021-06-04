public class Introduction {
    String addition = "足し算";
    String subtraction = "引き算";
    public void questionSelect() {
        System.out.println("問題番号を入力してください");
	    System.out.println("1 "+ this.addition);
	    System.out.println("2 "+ this.subtraction);
    }
    public void levelSelect() {
        System.out.println("難易度を選択してください");
	    System.out.println("1 ★");
	    System.out.println("2 ★★");
	    System.out.println("3 ★★★");
    }
}
