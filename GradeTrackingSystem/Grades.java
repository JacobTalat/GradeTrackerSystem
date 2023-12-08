package GradeTrackingSystem;

class Grades {
    private Assignment assignment;
    private Quiz quiz;
    private Exam Exam;

    public Grades() {
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public Quiz getQuiz() {
        return quiz;
    }


    public Exam getExam() {
        return Exam;
    }
    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void setExam(Exam exam) {
        this.Exam = exam;
    }

    public double getMaxGrade() {
        return assignment.getMaxGrade() + quiz.getMaxGrade() + Exam.getMaxGrade();
    }

}

