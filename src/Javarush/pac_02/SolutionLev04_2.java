package Javarush.pac_02;

import java.util.Scanner;

public class SolutionLev04_2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;
        if(a>0)d++;
        if(b>0)d++;
        if(c>0)d++;
        System.out.print(d);
    }
}
