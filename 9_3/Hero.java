public class Hero {
    String name;
    int hp;
    Sword sword;
    
    public void attack(String sword) {
        System.out.println(this.name + "は" + sword + "で攻撃した！");
        System.out.println("敵に５ポイントのダメージを与えた！");
    }
}