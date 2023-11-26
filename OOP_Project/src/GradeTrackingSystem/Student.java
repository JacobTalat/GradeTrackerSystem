package GradeTrackingSystem;

class Student {
    private String name;
    private Grades grades;

    public Student(String name, double assignmentScore, double quizScore, double examScore, Course course) {
        this.name = name;
        this.grades = new Grades(
                new Assignment(Math.min(assignmentScore, course.getMaxAssignment()), course.getMaxAssignment()),
                new Quiz(Math.min(quizScore, course.getMaxQuiz()), course.getMaxQuiz()),
                new Exam(Math.min(examScore, course.getMaxExam()), course.getMaxExam())
        );
    }

    public String getName() {
        return name;
    }

    public Grades getGrades() {
        return grades;
    }
}