package Lab7;
abstract class BaseClass {
    void debug() {
        System.out.println("Debugging class: " + this.getClass().getName());
    }
}
class Student extends BaseClass {
    void show() {
        System.out.println("This is Student class");
    }
}
class Teacher extends BaseClass {
    void show() {
        System.out.println("This is Teacher class");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        s.show();
        s.debug();  
        t.show();
        t.debug();   
    }
}