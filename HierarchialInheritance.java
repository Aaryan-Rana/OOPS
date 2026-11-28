public class HierarchialInheritance {
    public static void main(String[] args) {
        
    }
}

class shape {
    void describe() {
        System.out.println("I am shape");
    }
}

class circle extends shape {
    void drawcircle() {
        System.out.println("Drawing circle");
    }
}

class rectangle extends shape {
    void drawrectangle() {
        System.out.println("Drawing rectangle");
    }
}