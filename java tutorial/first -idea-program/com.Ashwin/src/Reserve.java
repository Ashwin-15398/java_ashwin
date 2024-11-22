import java.util.Scanner;

public class Reserve {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int number = in.nextInt();

        int ans = 0;
        while (number > 0 ){
            int rem = number % 10;
            number /= 10;
            ans = ans * 10 + rem;

        }
        System.out.println("your reversed number is: "+ans);
    }
}
