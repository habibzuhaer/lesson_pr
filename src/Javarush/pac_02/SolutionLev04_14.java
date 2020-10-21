package Javarush.pac_02;

import java.util.Scanner;

public class SolutionLev04_14 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Меня зовут" + " " +  name + ". ");
        System.out.println("Я родился " + d + "."+ m + "." + y);
    }
}
