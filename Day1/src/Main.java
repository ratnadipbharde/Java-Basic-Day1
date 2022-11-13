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
        obj1.checkString("Mumbai","Mumbai");
        System.out.println("--------------------------------");
        obj1.leapYear(2000);
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
    private void checkString( String s1, String s2) {
        if (s1.equals(s2))
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String are different");
        }
    }
    private void leapYear(int year){
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+" is a leap year");
      else
              System.out.println(year+" is not a leap year");
}
}