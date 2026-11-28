public class Inheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.fun();
        int res = obj.num2;
    }
}

class Base {
    int num1 = 10;
   protected int num2 = 20;

    void display() {
        System.out.println("Inside display");
    }

    void fun() {
        System.out.println("Inside fun " +num2);
    }
}

class Derived extends Base{
    int num3 = 30;
    int num4 = 40;

    void display2() {
        System.out.println("Inside display");
    }

    void fun2() {
        System.out.println("Inside fun");
    }
}