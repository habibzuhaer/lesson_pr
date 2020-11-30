package Javarush.pac_03;

public class Cat2 {
    //напишите тут ваш код
    String name;
    int weight = 8;
    int age = 8;
    String color = "red";
    String address = null;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}