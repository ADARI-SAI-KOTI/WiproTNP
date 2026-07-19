import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Box implements Comparable<Box> {
    private double length;
    private double width;
    private double height;
    private double volume;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = Math.round((length * width * height) * 100.0) / 100.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public int compareTo(Box other) {
        return Double.compare(this.volume, other.volume);
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Box> boxSet = new TreeSet<>();

        System.out.print("Enter the number of Box ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length ");
            double length = scanner.nextDouble();
            System.out.print("Enter Width ");
            double width = scanner.nextDouble();
            System.out.print("Enter Height ");
            double height = scanner.nextDouble();

            boxSet.add(new Box(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.println("Length =" + box.getLength() + 
                               " Width =" + box.getWidth() + 
                               " Height =" + box.getHeight() + 
                               " Volume =" + box.getVolume());
        }

        scanner.close();
    }
}