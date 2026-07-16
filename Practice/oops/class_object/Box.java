/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.*/
import java.util.Scanner;
public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter depth of the box: ");
        double depth = scanner.nextDouble();
        Box box = new Box(width, height, depth);
        System.out.println("The volume of the box is: " + box.getVolume());
        
        scanner.close();
    }

}