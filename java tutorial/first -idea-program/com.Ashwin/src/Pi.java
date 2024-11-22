import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("enter the radius: ");
        double radius = in.nextDouble();
        double area = radius * radius * PI;
        System.out.println("area of radius is " + area);

    }
}
/* naming conventions
1)variables and methods - preferred lower case and camel case (biggBossSeason8)
2)class - start each letter of class in  capital letter
3)constant - preferred whole word should be written in capital
 */
