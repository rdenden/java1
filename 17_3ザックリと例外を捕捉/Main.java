import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
		    FileWriter fw = new FileWriter("data.txt");
		    fw.write("hello!");
		    
		  //  Exceptionの子孫をどれでもキャッチ
		} catch (Exception e) {
		    System.out.println("何らかの例外が発生しました")
        // finallyを使えば、例外の有無に関わらず必ず実行させることができる
		} finally {
      fw.close();
    }
	}
}