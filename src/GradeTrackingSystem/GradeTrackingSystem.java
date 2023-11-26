package GradeTrackingSystem;
import java.util.ArrayList;
import java.util.List;


public class GradeTrackingSystem {
    public static void main(String[] args) {
        // Creating a course with specified maximum scores for assignment, quiz, and exam
        Course javaCourse = new Course("Java Programming", 100, 100, 100);

        // Creating students with their scores
        Student student1 = new Student("Alice", 75, 85, 90, javaCourse);
        Student student2 = new Student("Bob", 80, 90, 85, javaCourse);

        // Adding students to the course
        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);

        // Displaying students' scores
        System.out.println("Course Name: " + javaCourse.getCourseName());
        for (Student student : javaCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
            Grades grades = student.getGrades();
            System.out.println("Assignment Score: " + grades.getAssignment().getGrade() +
                    " / Max: " + grades.getAssignment().getMaxGrade());
            System.out.println("Quiz Score: " + grades.getQuiz().getGrade() +
                    " / Max: " + grades.getQuiz().getMaxGrade());
            System.out.println("Exam Score: " + grades.getExam().getGrade() +
                    " / Max: " + grades.getExam().getMaxGrade());
            System.out.println();
        }
    }
}
