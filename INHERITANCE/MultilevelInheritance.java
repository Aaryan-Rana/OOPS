public class MultilevelInheritance {
    public static void main(String[] args) {
        animal obj = new animal();
        obj.eat();
    }
}

class Livingthing {
    void breathe() {
        System.out.println("Breathing");
    }
}

class animal extends Livingthing {
    void eat() { // If private written then we cannot access from main class
        System.out.println("Eating");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("Sound of animal");
    }
}
