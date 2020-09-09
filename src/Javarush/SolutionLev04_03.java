package Javarush;

public class SolutionLev04_03 {
    public static class Cat {
        private static int catsCount = 0;

        public static void addNewCat() {
            //напишите тут ваш код
            Cat.catsCount++;
        }

        public static void main(String[] args) {
            Cat.addNewCat();
      //      Cat.addNewCat();
            System.out.println(Cat.catsCount);
        }
    }


}
