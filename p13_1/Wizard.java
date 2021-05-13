public class Wizard {
    int hp;
    int mp;
    String name;
    Wand wand;
    viod heal(Hero h) {
        int basePoint = 
            (int) (basePoint * this.wand.power);
        h.setHp(h.getHp() + recoverPoint);
        System.out.println
            (h.getName() + "のHPを" + recoverPoint + "回復した！");
    }
}