import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b =  b + a;
            a = temp;
            count++;
        }
System.out.println(b);
    }
}
/*
its fibonacci series
if   a    b    n

     0    1    1
     1    1    2
     1    2    3
     2    3    4
     3    5    5
     5    8    6
     8    13   7
     13   21   8
     temp + b
     which go into a
     a= temp
     b = b + a
     count is the lower number possible to run the while loop
     count++ increases the n th value



 */
