package Javarush.pac_01;
import java.io.*;
import java.util.*;
public class SolutionLev04_17 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if (age < 18 ) {
            System.out.println("Подрасти еще");
        }

    }
}
