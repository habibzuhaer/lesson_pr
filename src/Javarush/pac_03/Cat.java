package Javarush.pac_03;



public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int a = 0;
        int b =0;
        if (this.age>anotherCat.age) a++;
        else if (this.age<anotherCat.age) b++;
        if (this.weight>anotherCat.weight) a++;
        else if (this.weight<anotherCat.weight) b++;
        if (this.strength>anotherCat.strength) a++;
        else if (this.strength<anotherCat.strength) b++;
        if (a>b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
