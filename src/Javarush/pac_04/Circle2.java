package Javarush.pac_04;

public class Circle2 {
    public double x;
    public double y;
    public double radius;

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2(double x, double y) {
        //напишите тут ваш код
        this(x,y,10);
    }

    public Circle2() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle2 circle = new Circle2();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle2 anotherCircle = new Circle2(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

