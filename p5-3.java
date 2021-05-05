public class Main {
	public static void main(String[] args) {
	    double triangle_s = calcTriangleArea(4.0,5.0);
	    double circleArea_s =  calcCircleArea(10.0);
	    System.out.println(triangle_s + "平方cm");
	    System.out.println(circleArea_s + "平方cm");
	}
	public static double calcTriangleArea(double bottom,double height) {
	    double s = bottom * height / 2;
        return s;
	}
	public static double calcCircleArea(double radius) {
	    double PI = 3.14;
	    double s = radius * radius * PI;
        return s;
	}
}