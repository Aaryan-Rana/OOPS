public class Superkeyword {
    public static void main(String[] args) {
        derived obj = new derived(10, 20, 30, 40);
        obj.display();
    }
}

class base {
    base() {
        System.out.println("Inside base default constructor");
    }

    base(int x, int y) {
        System.out.println("Inside base parameterized constructor");
    }

    void display() {
        System.out.println("Inside base display");
    }
}

class derived extends base {
    derived() {
        System.out.println("Inside derived default constructor");
    }

    derived(int x, int y, int a, int b) {
        super(a, b);
        System.out.println("Inside derived parameterized constructor " +a +b);
    }

    void display() {
        super.display();    //Agar super nhi likha toh infinite times run hoga kyuki it gets confused , super likha toh seedha main class ke pass jayega
        System.out.println("Inside derived display");
    }
}
