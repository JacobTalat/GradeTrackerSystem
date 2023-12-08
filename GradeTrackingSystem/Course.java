package GradeTrackingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String courseName;
    private List<Student> students;
    private List<Assignment> assignments;
    private List<Quiz> quizzes;
    private double maxExam;
    // credit hours
    private Map<Student, Grades> studentGradesMap;

    public Course(String courseName, double maxExam) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.maxExam = maxExam;
        this.studentGradesMap = new HashMap<>();
        this.assignments = new ArrayList<>();
        this.quizzes = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(double maxGrade) {
        assignments.add(new Assignment(0.0, maxGrade));
    }

    public void addQuiz(double maxGrade) {
        quizzes.add(new Quiz(0.0, maxGrade));
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public double getMaxExam() {
        return maxExam;
    }

    public double getMaxAssignment() {
        double maxAssignment = 0.0;
        for (Assignment assignment : assignments) {
            maxAssignment += assignment.getMaxGrade();
        }
        return maxAssignment;
    }

    public double getMaxQuiz() {
        double maxQuiz = 0.0;
        for (Quiz quiz : quizzes) {
            maxQuiz += quiz.getMaxGrade();
        }
        return maxQuiz;
    }

    public void setStudentGrades(Student student, Grades grades) {
        studentGradesMap.put(student, grades);
    }

    public Grades getGradesForStudent(Student student) {
        return studentGradesMap.get(student);
    }
    public Map<Student, Grades> getStudentGradesMap() {
        return studentGradesMap;
    }
}
