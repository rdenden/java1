import java.util.*;

public class Main {
	public static void main(String[] args) {
		Hero a = new Hero("斎藤");
        Hero b = new Hero("鈴木");
    
        List<Hero> heroes = new ArrayList<>();
        heroes.add(a);
        heroes.add(b);
        
        for (Hero h: heroes) {
            System.out.println(h.getName());
        }
	}
}