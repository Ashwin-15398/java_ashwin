import java.util.Scanner;

public class Nested{
    public static void main(String[] args) {
        System.out.println(" please enter a fruit name: ");

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String grapes = in.next();
        String orange = in.next();


        switch (fruit) {
            case "apple":
                System.out.println("good for health");
                break;
            case "orange":
                System.out.println("thr round fruit");
                switch (orange) {
                    case "nellore":
                        System.out.println("Its green and more sweeter");
                        break;
                    case "chennai":
                        System.out.println("its black in colour and it has seeds ");
                        break;
                    default:
                        System.out.println("please mention the type of orange");
                        break;
                }
                break;
            case "grapes":
                System.out.println("its a small fruit");
                switch (grapes) {
                    case "green":
                        System.out.println("Its green and more sweeter");
                        break;
                    case "black":
                        System.out.println("its black in colour and it has seeds ");
                        break;
                    default:
                        System.out.println("please mention the type of grapes");
                        break;
                }
                break;
            default:
                System.out.println("please enter a valid fruit!");
                break;
        }
        System.out.println("please enter the day:");
        String days = in.next();
        switch (days) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("weekday");
            case "saturday", "sunday" -> System.out.println("weekend");
            default -> System.out.println("please enter a valid date");
        }
    }
}
