package GradeTrackingSystem;

class Exam implements GradeComponent {
    private double score;
    private double maxScore;

    public Exam(double score, double maxScore) {
        this.score = score;
        this.maxScore = maxScore;
    }

    @Override
    public double getGrade() {
        return score;
    }
    @Override
    public double getMaxGrade() {
        return maxScore;
    }
}
