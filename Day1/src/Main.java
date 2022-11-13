public class Main {
    int a;
    float b;
    boolean c;
    double d;
    long e;
    String s;
    public static void main(String[] args) {
//1.1 Write a program to display any message:
        Main obj1=new Main();
        obj1.displayMessage();
        System.out.println("--------------------------------");
        obj1.primitiveDataTypes();
        System.out.println("--------------------------------");
    }



    private void displayMessage() {
        System.out.println("Hello world!");
    }
    private void primitiveDataTypes() {

            System.out.println("int=" + a);
            System.out.println("float=" + b);
            System.out.println("boolean=" + c);
            System.out.println("double=" + d);
            System.out.println("long=" + e);
            System.out.println("String=" + s);

    }
}