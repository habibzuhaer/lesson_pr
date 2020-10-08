package Javarush.pac_02;

import java.util.Scanner;

public class SolutionLev04_1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 && a % 2==0)
            System.out.println("отрицательное четное число");
        else if (a<0 && a % 2!=0)
            System.out.println("отрицательное нечетное число");
        else if (a > 0 && a % 2 ==0)
            System.out.println("положительное четное число");
        else if (a > 0 && a% 2!=0)
            System.out.println("положительное нечетное число");
    }
}
