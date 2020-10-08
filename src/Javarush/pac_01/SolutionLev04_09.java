package pac_01;

public class SolutionLev04_09 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        // int month = a;
        if (month < 3 || month == 12) {
            System.out.println("зима");
        }
        else if (month >=3 && month <=5){
            System.out.println("весна");
        }
        else if (month >=6 && month <=8){
            System.out.println("лето");
        }
        else if (month > 8 && month <=11){
            System.out.println("осень");
        }

    }
}
