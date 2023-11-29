package GradeTrackingSystem;



public class Student {
    private String name;
    private final String student_ID;
    private Course[] enrolledCourses;
    private Grades[] grades;
    private int coursesCount;
    private static int seriesNumber = 1;

    public Student(String name, int yearEnrolled, int departmentNumber, int maxCourses) {
        this.name = name;
        this.student_ID = generateStudentID(yearEnrolled, departmentNumber);
        this.enrolledCourses = new Course[maxCourses];
        this.grades = new Grades[maxCourses];
        this.coursesCount = 0;
    }

    public void enrollCourse(Course course, double assignmentScore, double quizScore, double examScore) {
        if (coursesCount < enrolledCourses.length) {
            enrolledCourses[coursesCount] = course;
            grades[coursesCount] = new Grades(
                    new Assignment(Math.min(assignmentScore, course.getMaxAssignment()), course.getMaxAssignment()),
                    new Quiz(Math.min(quizScore, course.getMaxQuiz()), course.getMaxQuiz()),
                    new Exam(Math.min(examScore, course.getMaxExam()), course.getMaxExam())
            );
            coursesCount++;
        } else {
            System.out.println("Maximum courses reached for this student.");
        }
    }

    public String getName() {
        return name;
    }

    public Course[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public Grades[] getGrades() {
        return grades;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    private String generateStudentID(int yearEnrolled, int departmentNumber) {
        String year = String.valueOf(yearEnrolled);
        String dept = String.format("%03d", departmentNumber);
        String series = String.format("%03d", seriesNumber);

        seriesNumber++; // Increment series number for the next student

        return year + dept + series;
    }
}
