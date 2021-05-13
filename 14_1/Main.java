public class Main {
    public static void main (String[] arg) {
        // 暗黙の親クラスを承継
        Empty e = new Empty();
        String s = e.toString ();
        System.out.println(s);
    }
    
}
