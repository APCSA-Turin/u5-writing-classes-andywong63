package u5t1;
public class Person {
    private String firstName;
    private String lastName;
    private int meetings;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMeetings() {
        return meetings;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setMeetings(int meetings) {
        this.meetings = meetings;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void meet(Person otherPerson) {
        this.meetings++;
        otherPerson.setMeetings(otherPerson.getMeetings() + 1);
        System.out.println("Hello, my name is " + this.firstName + ".");
        System.out.println("Hi, my name is " + otherPerson.getFirstName() + ".");
    }
}