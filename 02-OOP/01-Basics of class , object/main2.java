class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // First object
        Student student1 = new Student();

        student1.name = "Toufik";
        student1.age = 21;

        // Second object
        Student student2 = new Student();

        student2.name = "Rahul";
        student2.age = 20;

        // Display information
        student1.displayInfo();
        student2.displayInfo();
    }
}
