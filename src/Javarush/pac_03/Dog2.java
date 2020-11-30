package Javarush.pac_03;

public class Dog2 {
    //напишите тут ваш код
    String name;
    int height;
    String color;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int height)
    {
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
