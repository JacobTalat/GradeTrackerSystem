package GradeTrackingSystem;

class Grades {
    private Assignment assignment;
    private Quiz quiz;
    private Exam Exam;

    public Grades(Assignment assignment, Quiz quiz, Exam Exam) {
        this.assignment = assignment;
        this.quiz = quiz;
        this.Exam = Exam;
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

    public double getMaxGrade() {
        return assignment.getMaxGrade() + quiz.getMaxGrade() + Exam.getMaxGrade();
    }

}

