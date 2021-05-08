public class Hero {
    String name;
    int hp;
    Sword sword;
    
    public void attack(Sword sword) {
        System.out.println(this.name + "は" + sword.name + "で攻撃した！");
        System.out.println("敵に５ポイントのダメージを与えた！");
    }
}
