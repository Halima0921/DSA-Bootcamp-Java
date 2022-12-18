//// Area Of circle.
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        //--Question 1(Area Of Circle Java Program)

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}
