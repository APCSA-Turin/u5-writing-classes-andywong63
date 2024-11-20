package u5t1;
public class Dice {
    private int sides;
    private int rollValue;
    private int rollCount;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
    public int getRollValue() {
        return rollValue;
    }
    public int getRollCount() {
        return rollCount;
    }
    
    public void setSides(int sides) {
        this.sides = sides;
    }

    public void roll() {
        rollValue = (int) (Math.random() * sides) + 1;
        rollCount++;
    }
}