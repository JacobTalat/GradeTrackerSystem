package GradeTrackingSystem;

class Quiz implements GradeComponent {
    private double score;
    private double maxScore; // Max score for quiz

    public Quiz(double score, double maxScore) {
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

    public void setGrade(double score) {
        this.score = score;
    }
}