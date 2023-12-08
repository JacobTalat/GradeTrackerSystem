package GradeTrackingSystem;
import java.util.ArrayList;
import java.util.List;


public class GradeTrackingSystem {
    public static void main(String[] args) {
        // Creating Courses
        Course mathCourse = new Course("Mathematics", 95.0);
        mathCourse.addAssignment(90.0); // Add an assignment with max grade of 90.0
        mathCourse.addQuiz(80.0);

        Course biologyCourse = new Course("Biology", 100);
        biologyCourse.addAssignment(90.0); // Add an assignment with max grade of 90.0
        biologyCourse.addQuiz(80.0); // Add a quiz with max grade of 80.0


        // Creating Students
        Student alice = new Student("Alice", 170);
        Student bob = new Student("Bob", 180);
        Student carol = new Student("Carol", 190);

        // Enrolling Students in Courses
        alice.enrollStudent(biologyCourse);
        bob.enrollStudent(mathCourse);
        bob.enrollStudent(biologyCourse); // Bob enrolled in another course

        // Setting Grades for Students
        alice.setAssignmentGrade(17, biologyCourse);
        alice.setQuizGrade(4, biologyCourse);
        alice.setExamGrade(45, biologyCourse);

        bob.setAssignmentGrade(40, mathCourse);
        bob.setQuizGrade(8, mathCourse);
        bob.setExamGrade(50, mathCourse);

        bob.setAssignmentGrade(19, biologyCourse);
        bob.setQuizGrade(3, biologyCourse);
        bob.setExamGrade(40, biologyCourse);

        // Accessing and displaying Students' Information and Grades
        displayStudentInformation(alice);
        displayStudentInformation(bob);
        displayStudentInformation(carol);
    }

    private static void displayStudentInformation(Student student) {
        System.out.println("Student ID: " + student.getStudent_ID());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Courses enrolled: " + student.getCourseList().size());

        // Accessing and displaying Student Grades for each enrolled course
        for (Course course : student.getCourseList()) {
            Grades studentGrades = student.getGrades(course);
            System.out.println("Course: " + course.getCourseName());
            if (studentGrades != null) {
                System.out.println("Assignment Grade: " + studentGrades.getAssignment().getGrade() + " out of " + course.getMaxAssignment());
                System.out.println("Quiz Grade: " + studentGrades.getQuiz().getGrade() + " out of " + course.getMaxQuiz());
                System.out.println("Exam Grade: " + studentGrades.getExam().getGrade() + " out of " + course.getMaxExam());
            } else {
                System.out.println("Grades not available for this course yet.");
            }
        }
        System.out.println();
    }
}
