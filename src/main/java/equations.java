import java.util.Scanner;
import java.lang.Math;

public class equations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = (b * b) - 4 * a * c;
        if (d > 0){
            System.out.println("x1 = " + (-b + Math.sqrt(d))/(2*a));
            System.out.println("x2 = " + (-b - Math.sqrt(d))/(2*a));
        }
        else {
            System.out.println("Нет вещественных корней");
        }
        scanner.close();
    }



}
