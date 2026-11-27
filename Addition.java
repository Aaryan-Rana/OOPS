public class Addition {
    public static void main(String[] args) {
        int sum = 0;
        sum = addition(20, 20);
        Arithmetic obj = new Arithmetic();
        sum = obj.addition(10, 20);
        System.out.println("Addition of number is: " + sum);
    }

    static int addition(int a, int b) {
        return a + b;
    }
}

class Arithmetic {
    int multiply = 1;

    Arithmetic() {
        System.out.println("Inside default constructor");
    }

    Arithmetic(int x, int y) {
        System.out.println("Inside parameterized constructor");
    }

    int addition(int a, int b) {
        return a + b;
    }

}
