import models.Student;

public class Application {
    public static void main(String args) {
        Student stu = new Student();
        stu.setFullName("Thanh An");
        System.out.println(stu.getFullName());
    }
}
