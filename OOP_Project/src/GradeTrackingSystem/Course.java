package GradeTrackingSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private double maxAssignment;
    private double maxQuiz;
    private double maxExam;

    public Course(String courseName, double maxAssignment, double maxQuiz, double maxExam) {
        this.courseName = courseName;
        this.maxAssignment = maxAssignment;
        this.maxQuiz = maxQuiz;
        this.maxExam = maxExam;
    }

    public String getCourseName() {
        return courseName;
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
}
