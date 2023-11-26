package GradeTrackingSystem;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> students;
    private double maxAssignment;
    private double maxQuiz;
    private double maxExam;

    public Course(String courseName, double maxAssignment, double maxQuiz, double maxExam) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.maxAssignment = maxAssignment;
        this.maxQuiz = maxQuiz;
        this.maxExam = maxExam;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getMaxAssignment() {
        return maxAssignment;
    }

    public double getMaxQuiz() {
        return maxQuiz;
    }

    public double getMaxExam() {
        return maxExam;
    }
//    public double getMaxGrade() {
//        return maxGrade;
//    }

}
