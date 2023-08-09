import java.util.ArrayList;

class Student {
    private String name;
    private int enrollmentNumber;
    private String grade;

    public Student(String name, int enrollmentNumber, String grade) {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", \n Enrollment Number: " + enrollmentNumber + ",\n Grade: " + grade + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student("ABC", 1001, "A"));
        students.add(new Student("DEF", 1002, "B"));
        students.add(new Student("OPQ", 1003, "A"));

        // Displaying students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
