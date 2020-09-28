package Javarush;

import java.io.*;
import java.util.*;

public class SolutionLev04_12 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a+b > c && a+c > b && c+b > a )
            System.out.println("Треугольник существует."  );
        else
            System.out.println("Треугольник не существует.");
    }
}
