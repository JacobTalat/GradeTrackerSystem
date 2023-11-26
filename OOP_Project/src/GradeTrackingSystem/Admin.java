package GradeTrackingSystem;

class Admin implements User {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
