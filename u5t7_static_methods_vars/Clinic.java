package u5t7_static_methods_vars;

public class Clinic {
    private int vaccinesGiven = 0;
    private Person recentVaccinated;
    private static int totalClinics = 0;
    private static int totalVaccinesGiven = 0;

    public Clinic() {
        totalClinics++;
    }

    public boolean vaccinate(Person person) {
        if (person.isVaccinated()) return false;
        person.setVaccinated();
        vaccinesGiven++;
        recentVaccinated = person;
        totalVaccinesGiven++;
        return true;
    }

    public int getClinicVaccineCount() {
        return vaccinesGiven;
    }
    public Person mostRecentlyVaccinated() {
        return recentVaccinated;
    }
    public static int getTotalClinics() {
        return totalClinics;
    }
    public static int getTotalVaccineCount() {
        return totalVaccinesGiven;
    }
}