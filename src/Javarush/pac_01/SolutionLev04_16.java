package Javarush.pac_01;
import java.util.*;
public class SolutionLev04_16 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String nameOne = sc.nextLine();
        String nameTwo = sc.nextLine();
        if (nameOne.equals(nameTwo))
            System.out.println("Имена идентичны");
        else if(nameOne != nameTwo && nameOne.length() == nameTwo.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
