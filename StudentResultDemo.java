public class StudentResultDemo {
    public static void main(String[] args) {
        int[] marks = { 80, 75, 90 };

        StudentResult student = new StudentResult("Aaryan", 12, marks);
        student.displayResult();
    }
}

class StudentResult {
    String name;
    int rollNumber;
    int[] marks;

    StudentResult(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}