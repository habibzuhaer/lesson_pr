package Javarush.pac_03;

public class SolutionLev5_04 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++)
            new Cat("Cat"+i, i, i+10, i+5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
