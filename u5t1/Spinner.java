package u5t1;
public class Spinner {
    private int sections;
    private int spinValue;
    private int spinCount;
    private int spinSum;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public int getSpinValue() {
        return spinValue;
    }
    public int getSpinCount() {
        return spinCount;
    }
    public int getSpinSum() {
        return spinSum;
    }

    public void spin() {
        spinValue = (int) (Math.random() * sections) + 1;
        spinSum += spinValue;
        spinCount++;
    }

    public double averageSpin() {
        return (double) spinSum / spinCount;
    }
}