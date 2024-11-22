import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= nth){
            int temp = b;
            b= b+a;
            a = temp;
            count++;
            System.out.println(temp);
        }
        System.out.println(b);



    }
}
