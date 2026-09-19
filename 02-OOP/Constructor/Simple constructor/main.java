class Student {

    String name;
    int age;

    // Constructor
    Student() {
        name = "Toufik";
        age = 21;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Calling method
        s1.display();
    }
}
