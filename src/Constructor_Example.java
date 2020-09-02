public class Constructor_Example {
    int i;
    void ConstructorExample(String hello, int i){
        this.i = i;
        System.out.println("run");
        System.out.println(hello);

    }
}
class Run {
    public static void main(String[] args) {
        Constructor_Example constructorExample = new Constructor_Example("Hello");
    }
}
