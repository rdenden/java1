public class Thief {
    String name;
    int hp;
    int mp;
    
    public Thief(String name,int hp,int mp) {
        this name = name;
        this hp = hp;
        this mp = mp;
    }
    public Theif(String name, int hp) {
        // 引数二つの時、MPを設定して引数を三つにして１番目のコンストラクタを呼ぶ
        this(name,hp,5);
    }
    public Theif(String name) {
        // 引数一つの時、HPを設定して引数２つにして２番目のコンストラクタを呼ぶ
        this(name,40);
    }
}