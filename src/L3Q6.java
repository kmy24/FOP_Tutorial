import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter a coordinate (x y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distanceSquared = x * x + y * y;

        if (distanceSquared == 0) {
            System.out.println("Point is at the centre of the circle");
        } else if (distanceSquared <= radius * radius) {
            System.out.println("Point is inside the circle");
        } else {
            System.out.println("Point is outside the circle");
        }
    }
}
