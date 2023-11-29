package GradeTrackingSystem;

class Instructor implements User {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
