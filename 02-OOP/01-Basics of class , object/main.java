// Class
class Student {

    // Properties / Attributes
    String name;
    int age;
    double marks;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class ClassAndObject {

    public static void main(String[] args) {

        // Creating an object
        Student student1 = new Student();

        // Assigning values
        student1.name = "Toufik";
        student1.age = 21;
        student1.marks = 85.5;

        // Calling method
        student1.displayInfo();
    }
}
