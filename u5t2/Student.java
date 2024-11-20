package u5t2;

public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel >= 1 && gradeLevel <= 5) {
            this.school = "elementary school";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            this.school = "middle school";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.school = "high school";
        } else {
            this.school = "unknown";
        }
    }

    public String studentInfo() {
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}