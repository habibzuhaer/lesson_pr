public class Lesson20 {
    public static void main(String[] args) {
        Human2 human1 = new Human2();
        human1.setName("Bob");
        human1.setAge(19);
    }
}
class Human2 {
    private  String name;
    private  int age;

    public Human2() {
        System.out.println("Привет из первого конструктора !");
    }
    public Human2(String name){
        System.out.println("Привет из второго конструктора !");
        this.name =name;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
}
