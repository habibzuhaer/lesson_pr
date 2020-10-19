package Javarush.pac_02;


import java.io.*;
import java.util.*;

public class SolutionLev04_9 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       int n = sc.nextInt();
       for (int i = 0 ;i < m ;i++){
           for (int j = 0 ;j < n ;j++)
               System.out.print(8);
           System.out.println(" ");
       }
    }
}
