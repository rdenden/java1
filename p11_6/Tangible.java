public abstract class TangibleAsset {
    String name;
    int price;
    String color;
    
    public TangibleAsset (String name,int price,String color) {
        this.name;
        this.price = price;
        this.color = color;
    }
    
    
    public abstract void getName() {return this.name;}
    public abstract void getPrice() {return this.price;}
    public abstract void getColor() {return this.color;}
}