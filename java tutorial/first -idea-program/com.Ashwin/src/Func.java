import java.util.Scanner;

public class Func {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        swap();
        System.out.println("please enter two numbers");
        sum(in.nextInt(), in.nextInt());
    }
    static void swap(){
        Scanner in = new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int a = Integer.parseInt(in.next());
        System.out.print("please enter the second number: ");
        int b = Integer.parseInt(in.next());
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap b to a: "+ a);
        System.out.println("swap a to b: "+ b);
    }
    static void sum( int c, int d){
        int e = (c * d)+(d * c);
        System.out.print("the sum of c and d is:  "+ e);
    }
}
