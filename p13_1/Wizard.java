public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException
            ("MPは0以上にしてください");
        }
        this.mp = mp;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException
            ("魔法使いの名前は３文字以上にしてください");
        }
        this.name = name;
    }
    
    public Wand getWand() {
        return this.wand;
    }
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException
            ("魔法使いは必ず杖を装備してください");
        }
        this.wand = wand;
    }
    
    
    public viod heal(Hero h) {
        int basePoint = 
            (int) (basePoint * this.wand.power);
        h.setHp(h.getHp() + recoverPoint);
        System.out.println
            (h.getName() + "のHPを" + recoverPoint + "回復した！");
    }
}
