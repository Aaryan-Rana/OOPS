public class MethodOverriding {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.display();
    }
}

class base {
    void display() {
        System.out.println("Inside base class");
    }
}

class derived extends base {
    @Override
    void display() {
        System.out.println("Inside derived display");
    }
}