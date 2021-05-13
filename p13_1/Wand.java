public class Wand {
    private String name;
    private double power;
    
    public String getName {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException
            ("杖の名前は３文字以上にしてください");
        }
        this.name = name;
    }
    

    public double getPower {
        return this.power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException
            ("杖の増幅率は0.5〜100の間で設定してください");
        }
        this.power = power;
    }
}

