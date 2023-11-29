package GradeTrackingSystem;

public class TestMain {
    public static void main(String[] args) {
        Course mathCourse = new Course("Math", 100, 50, 150);
        Course physicsCourse = new Course("Physics", 120, 60, 180);
        Course biologyCourse = new Course("Biology", 90, 40, 130);

        // Creating students
        Student student1 = new Student("Alice", 2023, 101, 3);
        Student student2 = new Student("Bob", 2022, 102, 2);

        // Enrolling students in different courses
        student1.enrollCourse(mathCourse, 80, 45, 130);
        student2.enrollCourse(physicsCourse, 90, 48, 140);
        student1.enrollCourse(biologyCourse, 70, 40, 120);

        // Displaying information about students and their courses
        displayStudentInfo(student1);
        displayStudentInfo(student2);
    }

    public static void displayStudentInfo(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudent_ID());
        System.out.println("Courses enrolled:");

        Course[] courses = student.getEnrolledCourses();
        Grades[] grades = student.getGrades();

        for (int i = 0; i < student.getEnrolledCourses().length; i++) {
            if (courses[i] != null && grades[i] != null) {
                System.out.println("Course: " + courses[i].getCourseName());
                System.out.println("Assignment Grade: " + grades[i].getAssignment().getGrade() + " / " + courses[i].getMaxAssignment());
                System.out.println("Quiz Grade: " + grades[i].getQuiz().getGrade() + " / " + courses[i].getMaxQuiz());
                System.out.println("Exam Grade: " + grades[i].getExam().getGrade() + " / " + courses[i].getMaxExam());
                System.out.println();
            }
        }
    }
}
