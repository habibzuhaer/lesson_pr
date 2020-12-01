package Javarush.pac_03;

public class Solution0514 {
    public static void main(String[] args) {

        Person person = new Person();
        person.initialize("Alex", 30);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.age = age;
            this.name = name;
        }

    }
}
