package u5t7_static_vars;

public class Student {
    private String name;
    private int points = 0;
    private static int totalPoints = 0;
    private static int greatestPoints = 0;

    public Student(String name) {
        this.name = name;
    }

    public void addPoints(int add) {
        points += add;
        totalPoints += add;
        if (points > greatestPoints) {
            greatestPoints = points;
        }
    }

    public String studentInfo() {
        return "Student: " + name
           + "\nStudent's Points: " + points;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPoints
           + "\nMost points earned by any student: " + greatestPoints;
    }
}