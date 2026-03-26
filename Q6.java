package Lab7;
class Course {
    int id;
    String description;
    int duration; 
    double fees;
    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    } 
    void GetData() {
        System.out.println("Course ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);
        System.out.println("------------------------");
    }
}
public class Q6{
    public static void main(String[] args) { 
        Course[] courses = new Course[5]; 
        courses[0] = new Course(101, "Java Programming", 60, 5000);
        courses[1] = new Course(102, "Python Programming", 45, 4500);
        courses[2] = new Course(103, "Web Development", 50, 6000);
        courses[3] = new Course(104, "Data Structures", 55, 5500);
        courses[4] = new Course(105, "Machine Learning", 70, 8000); 
        for (int i = 0; i < courses.length; i++) {
            courses[i].GetData();
        }
    }
}
