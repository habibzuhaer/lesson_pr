package Javarush.pac_02;

import java.util.Scanner;

public class SolutionLev04_13 {
    public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
    System.out.println(a+b+c-Math.min(Math.min(a,b),c)-Math.max(Math.max(a,b),c));
}

}
