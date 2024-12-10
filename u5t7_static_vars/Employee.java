package u5t7_static_vars;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployeeID++;
        id = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return id;
    }

    public String employeeInfo() {
        String result =
                    "--------------------------";
        result += "\nEmployee full name: " + getFullName();
        result += "\nEmployee ID: " + id;
        result += "\nMost recent ID assigned: " + mostRecentEmployeeID;
        result += "\nTotal employees hired: " + totalEmployeesCreated;
        result += "\n--------------------------";
        return result;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }
}