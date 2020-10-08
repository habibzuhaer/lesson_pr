package pac_01;
import java.io.*;

public class SolutionLev04_11 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     //   String str = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        if (year % 400 != 0 & year % 100 != 0 | year % 4 != 0)
            System.out.println("количество дней в году: 365");
        else
            System.out.println("количество дней в году: 366");
        ///
        ////
        /////
    }
}
