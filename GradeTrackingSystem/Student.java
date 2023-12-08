package GradeTrackingSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private Grades grades;
    private String student_ID;
    private ArrayList<Course> courseList; //make is string array
    private static int seriesNumber = 1;

    public Student(String name, int departmentNumber) {
        this.name = name;
        this.student_ID = generateStudentID(departmentNumber);
        this.courseList = new ArrayList<>();
    }

    public void enrollStudent(Course course) {
        course.addStudent(this);
        courseList.add(course);
    }

    public void setAssignmentGrade(double grade, Course course) {
        Grades grades = course.getGradesForStudent(this);
        if (grades == null) {
            grades = new Grades();
            course.setStudentGrades(this, grades);
        }
        grades.setAssignment(new Assignment(grade, course.getMaxAssignment()));
    }

    public void setQuizGrade(double grade, Course course) {
        Grades grades = course.getGradesForStudent(this);
        if (grades == null) {
            grades = new Grades();
            course.setStudentGrades(this, grades);
        }
        grades.setQuiz(new Quiz(grade, course.getMaxQuiz()));
    }

    public void setExamGrade(double grade, Course course) {
        Grades grades = course.getGradesForStudent(this);
        if (grades == null) {
            grades = new Grades();
            course.setStudentGrades(this, grades);
        }
        grades.setExam(new Exam(grade, course.getMaxExam()));
    }



    public String getName() {
        return name;
    }

    public Grades getGrades(Course course) {
        return course.getGradesForStudent(this);
    }


    public String getStudent_ID() {
        return student_ID;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    private boolean isGradeValid(double grade, double maxGrade) {
        return grade <= maxGrade;
    }

    public boolean isAssignmentGradeValid(double assignmentGrade, Course course) {
        double maxAssignmentGrade = course.getMaxAssignment();
        return isGradeValid(assignmentGrade, maxAssignmentGrade);
    }

    public boolean isQuizGradeValid(double quizGrade, Course course) {
        double maxQuizGrade = course.getMaxQuiz();
        return isGradeValid(quizGrade, maxQuizGrade);
    }

    public boolean isExamGradeValid(double examGrade, Course course) {
        double maxExamGrade = course.getMaxExam();
        return isGradeValid(examGrade, maxExamGrade);
    }

    // calculates total grade
    // grades to letters


    private String generateStudentID(int departmentNumber) {
        LocalDate currentDate = LocalDate.now();
        int yearEnrolled = currentDate.getYear();
        String year = String.valueOf(yearEnrolled);
        String dept = String.format("%03d", departmentNumber);
        String series = String.format("%03d", seriesNumber);

        seriesNumber++;

        return year + dept + series;
    }
}
