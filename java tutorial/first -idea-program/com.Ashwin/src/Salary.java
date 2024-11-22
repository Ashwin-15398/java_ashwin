import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter ur current salary :");
        int salary = in.nextInt();
        if(salary > 10000 && salary <20000){
            salary = salary + 2000;
        } else if (salary > 20000) {
            salary = salary + 3000;
        }
        else {
            salary = salary+ 1000;
        }
        System.out.println("ur current salary ="+ salary);
    }
}
