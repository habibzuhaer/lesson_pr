package Javarush.pac_02;

import java.util.Scanner;
public class SolutionLev04_5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int n = sc.nextInt();
        while (n-- < 0)
            System.out.println(a);

    }
}
