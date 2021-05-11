public class SuperHero extends Hero {
    String name = "ミナト";
    int hp = 100;
    boolean flying;
    
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
}