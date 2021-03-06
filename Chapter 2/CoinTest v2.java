import java.util.Scanner;
/**
 * This program uses a Circle class to find the circumference and area from a given radius
 * @author Cade
 */
public class CircleTest
{
    /**
     * main method
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\fEnter the radius: ");
        double r = scan.nextDouble();
        Circle circle1 = new Circle(r);
        double area = circle1.getArea();
        System.out.println("circle1 // radius = " + r + " area = " + area + " sq. units");
        double circumference = circle1.getCircumference();
        System.out.println("circumference = " + circumference + " units\n");
    
        System.out.print("Enter another radius: ");
        r = scan.nextDouble();
        Circle circle2 = new Circle(r);
        System.out.println("circle2 // area = " + circle2.getArea() + " sq. units\ncircumference = " 
                            + circle2.getCircumference() + " units\n");
                            
        System.out.print("Enter another radius: ");
        r = scan.nextDouble();
        Circle circle3 = new Circle(r);
        System.out.println("circle3 // area = " + circle3.getArea() + " sq. units\ncircumference = " 
                            + circle3.getCircumference() + " units\n");
    }
}
