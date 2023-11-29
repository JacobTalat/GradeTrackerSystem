package GradeTrackingSystem;

class Assignment implements GradeComponent {
    private double score;
    private double maxScore;

    public Assignment(double score, double maxScore) {
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