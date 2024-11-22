import java.util.Scanner;

public class Praveen {
    public static void main(String[] args) {
        System.out.println("please enter a valid day");

        Scanner in = new Scanner(System.in);
        String day = in.next();


        switch (day) {
            case "monday", "tuesday", "wednesday", "friday" -> System.out.println("it's a weekday");
            case "saturday", "sunday" -> System.out.println("weekend");
        }
    }
}
