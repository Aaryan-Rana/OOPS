public class Runtimepolymorphism {
    public static void main(String[] args) {
        animal obj = new dog();
        animal obj2 = new cat();
        obj.sound();
        obj2.sound();
    }
}

class animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class cat extends animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
