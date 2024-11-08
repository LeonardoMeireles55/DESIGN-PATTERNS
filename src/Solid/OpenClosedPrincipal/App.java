package Solid.OpenClosedPrincipal;

public class App {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(5);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.calculateArea(rectangle));
        System.out.println(areaCalculator.calculateArea(circle));
        
    }
}
