package Javarush.pac_01;
import java.util.*;
public class SolutionLev04_19 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a==b && a!=c)
            System.out.println(3);
        else if (a == c && a !=b)
            System.out.println(2);
        else if (a!=b && b==c)
            System.out.println(1);
    }
    }