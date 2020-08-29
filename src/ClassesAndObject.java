
public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман",20);

        Person person2 = new Person();
        //person2.setName("Вова");
        String s1 = "Вова";
        person2.setNameAndAge(s1,55);

       // int year1 = person1.calculeteYerssToRetirement();
       // int year2 = person2.calculeteYerssToRetirement();
        //System.out.println("Первому человеку до пенсии : "+ year1 + " лет !" );
        //System.out.println("Второму человеку до пенсии : "+ year2 + " лет !" );
        person1.speak();
    }
}
class Person {
    private String name;
    private int age ;

    public void setName(String username) {
        name = username;
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge() {
        return age;
    }

    void setNameAndAge(String username , int userage){
        name = username;
        age = userage;
    }
    // int calculeteYerssToRetirement(){
    // int years = 65-age;
    // return years;
    // System.out.println("Количество лет до пенсии : "+years );
    //  }
    void speak() {
        for(int i=0;i<2;i++)
            System.out.println("Меня зовут " + name + ", мне "+age+" лет !" );
    }
    void sayHello() {
        System.out.println("Привет !");
    }
}
