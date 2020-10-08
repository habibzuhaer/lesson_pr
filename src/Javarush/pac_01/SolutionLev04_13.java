package pac_01;
import java.util.Scanner;

public class SolutionLev04_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b || a == c) {
            System.out.println(a + " " + a + " ");
        } else if (b == a || b == c) {
            System.out.println(b + " " + b + " ");
        }
    }
}