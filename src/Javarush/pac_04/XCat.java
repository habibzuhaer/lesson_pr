package Javarush.pac_04;

public class XCat {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public XCat(String name) {
        this.age = 5;
        this.name = name;
        this.weight = 5;
        this.color = "White";
    }

    public XCat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public XCat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "Grey";
    }

    public XCat(int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public XCat(int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}