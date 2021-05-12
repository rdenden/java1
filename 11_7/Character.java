public class Character {
    String name;
    int hp;
    
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
    // 抽象メソッド　現時点では確定できないメソッド
    public abstract void attack(Matango m);
}
