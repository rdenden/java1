public class PoisonMatango extends Matango {
    int poisonNum = 5;
    char suffix
    public poisonMatango(char suffix) {
        super(suffix)
    }
    public attack(Hero h) {
        super.attack(h);
        if (this.poisonNum > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int dmg = h.hp / 5;
            h.hp -= dmg;
            System.out.println(h.hp / 5 + "ポイントのダメージ！");
            this.poisonNum--;
        }
        
        
    }
}
