
public class Lesson20 {
    public static void main(String[] args) {
        Humans human1 = new Humans("Bob" ,19);    // - параметры выбирают конструктор
        human1.setName("Bob");
        human1.setAge(19);
    }
}
class Humans {
    private  String name;
    private  int age;

   // public Human() {
    //    this.name = "Имя по умолчанию";
    //    this.age = 19;
   //}

    public Humans() {
        System.out.println("Привет из первого конструктора !");
    }
    public Humans(String name){
        System.out.println("Привет из второго конструктора !");
        this.name =name;
    }

    public Humans(String name, int age) {
        System.out.println("Привет из третьего конструктора !");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
}
