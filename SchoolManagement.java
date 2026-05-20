// Base Class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void showRole() {
        System.out.println("I am a person.");
    }
}

// Teacher Class
class Teacher extends Person {
    String subject;
    double salary;

    // Constructor
    Teacher(String name, int age, String subject, double salary) {
        super(name, age); // calls parent constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Method Overriding
    @Override
    void showRole() {
        System.out.println("----- /Teacher Details./ -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("I am a Teacher. I teach students.");
    }
}

// Student Class
class Student extends Person {
    int rollNumber;
    String course;

    // Constructor
    Student(String name, int age, int rollNumber, String course) {
        super(name, age); // calls parent constructor
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method Overriding
    @Override
    void showRole() {
        System.out.println("----- /Student Details./ -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("I am a Student. I study subjects.");
    }
}

public class SchoolManagement {
    public static void main(String[] args) {

        // Creating Teacher Object
        Teacher t1 = new Teacher(
                "Ashish Shivhare",
                25,
                "Java Programming",
                50000
        );

        // Creating Student Object
        Student s1 = new Student(
                "Samarth Singnapure",
                19,
                11269,
                "CSE AIML"
        );

        // Polymorphism
        Person[] people = new Person[2];

        people[0] = t1;
        people[1] = s1;

        // Loop through array
        for (Person p : people) {
            p.showRole();
            System.out.println();
        }
    }
}


//---> OUTPUT OF THE CODE <---

//----- /Teacher Details./ -----
//Name: Ashish Shivhare
//Age: 25
//Subject: Java Programming
//Salary: 50000.0
//I am a Teacher. I teach students.

//----- /Student Details./ -----
//Name: Samarth Singnapure
//Age: 19
//Roll Number: 11269
//Course: CSE AIML
//I am a Student. I study subjects.