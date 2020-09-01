public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Bob");
        human1.setAge(19);
    }
}
class Human2 {
    private  String name;
    private  int age;
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
}
