import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        double side, area;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Length of Side of an Equilateral Triangle");
        side = scanner.nextDouble();
        area = Math.sqrt(3) / 4 * side * side;
        System.out.format("The Area of Equilateral Triangle = %.3f \n", area);
    }
}
