public class ThisKeyword {
    public static void main(String[] args) {
        Demo obj = new Demo(10, 20);
        obj.display();
    }
    
}

class Demo{
    int a = 30;
    int b = 40;

    Demo(int a, int b){
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("The value of c is: " +a +"The value of d is: " + b);
    }
}
