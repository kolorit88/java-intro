import java.util.Scanner;
import java.lang.Math;

public class equations {

    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        System.out.println(equations_method(a,b,c));
    }

    public static String equations_method(int a, int b, int c){
        int d = (b * b) - 4 * a * c;
        double x_1 = (-b + Math.sqrt(d))/(2*a);
        double x_2 = (-b - Math.sqrt(d))/(2*a);

        if (d > 0){
            return "x1 = " + x_1 + "\n" + "x2 = " + x_2;
        }
        else {
            return "Нет вещественных корней";
        }

    }

}
