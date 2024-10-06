package exp4;

import java.util.Scanner;

public class ShapeAreaCalculator {
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static int calculateArea(int width, int length) {
        return width * length;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Base of the Triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the Height of the Triangle: ");
        double triangleHeight = scanner.nextDouble();
        double triangleArea = calculateArea(triangleBase, triangleHeight);

        System.out.print("Enter the Width of the Rectangle: ");
        int rectangleWidth = scanner.nextInt();
        System.out.print("Enter the Height of the Rectangle: ");
        int rectangleHeight = scanner.nextInt();
        int rectangleArea = calculateArea(rectangleWidth, rectangleHeight);

        System.out.print("Enter the Radius of the Circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculateArea(circleRadius);

        System.out.println("Area of Triangle with base: " + triangleBase + " and height: " + triangleHeight + " is: " + triangleArea);
        System.out.println("Area of Rectangle with width: " + rectangleWidth + " and length: " + rectangleHeight + " is: " + rectangleArea);
        System.out.println("Area of Circle with radius: " + circleRadius + " is: " + circleArea);

        scanner.close();
    }
}
