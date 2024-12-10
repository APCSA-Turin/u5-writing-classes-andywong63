package u5t7_static_methods_vars;

public class Person {
    private String name;
    private boolean vaccinated;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated() {
        vaccinated = true;
    }
}