public class Methodoverloading {
    public static void main(String[] args) {
        OverloadMethod obj = new OverloadMethod();
        obj.addition(20, 20);

    }
}

class OverloadMethod {
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    double addition(float a, float b, float c) {
        return a + b + c;
    }
}