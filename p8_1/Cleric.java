public class Cleric {
    String name;
    int hp = 50;
    final int HPMax = 50;
    int mp = 10;
    final int MPMax = 10;
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = HPMax;
        System.out.println("HPが最大まで回復した！")
    }
}
