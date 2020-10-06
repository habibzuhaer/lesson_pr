package Javarush.pac_01;
import java.io.*;
import java.util.*;

public class SolutionLev04_15 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int max =  Math.max(Math.max(a,b),c);
        int min =  Math.min(Math.min(a,b),c);
        int sum = (a+b+c)-min-max;
        System.out.println(max+" "+sum+" "+min);
    }
}
