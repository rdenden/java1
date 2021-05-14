public class Cleric {
    String name;
    int hp = 50;
    // 静的メンバー
    static final int HPMAX = 50;
    int mp = 10;
    // 静的メンバー
    static final int MPMAX = 10;
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = HPMax;
        System.out.println("HPが最大まで回復した！")
    }
    public int pray(sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！")
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoveryPoint = Math.min(this.MPMAX - this.mp,recover);
        this.mp += recoveryPoint;
        System.out.println("MPが" + recoveryPoint + "回復した！")
        return recoveryPoint;
    }
}
