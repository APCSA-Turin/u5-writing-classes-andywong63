public class StepTracker {
  private int minSteps;
  private int days = 0;
  private int activeDays = 0;
  private int totalSteps = 0;

  public StepTracker(int minSteps) {
    this.minSteps = minSteps;
  }

  public int activeDays() {
    return activeDays;
  }

  public void addDailySteps(int steps) {
    totalSteps += steps;
    days++;
    if (steps >= minSteps) {
      activeDays++;
    }
  }

  public double averageSteps() {
    if (days == 0) {
      return 0;
    }
    return (double) totalSteps / days;
  }
}
