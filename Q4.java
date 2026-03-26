package Lab7;
class Teacher {
    String name;
    int age;
    String subject;
    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
class Student extends Teacher {
    int rollNo;
    String course;
    Student(String name, int age, String subject, int rollNo, String course) {
        super(name, age, subject); 
        this.rollNo = rollNo;
        this.course = course;
    }
    void displayStudent() {
        displayTeacher(); 
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
public class Q4 {
    public static void main(String[] args) {
        Student s = new Student("Harini", 20, "Maths", 101, "BSc IT");
        s.displayStudent();
    }
}