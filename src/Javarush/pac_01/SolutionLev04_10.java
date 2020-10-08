package pac_01;
import java.io.*;

public class SolutionLev04_10 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String nr = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {
            int b = a * 2;
            System.out.println(b);
        }
        if (a < 0) {
            System.out.println(a + 1);
        }
        if (a == 0) {
            System.out.println(a);
        }
    }
}
