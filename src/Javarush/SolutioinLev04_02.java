package Javarush;

public class SolutioinLev04_02 {
    public static class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;

        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
}
