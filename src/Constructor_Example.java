public class Constructor_Example {
    int i;
    Constructor_Example(String hello, int i){
        this.i = i;
        System.out.println("run");
        System.out.println(hello);

    }
}
class Run {
    public static void main(String[] args) {
        Constructor_Example constructorExample = new Constructor_Example("Hello",5);
        System.out.println(constructorExample.i);
    }
}
