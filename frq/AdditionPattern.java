public class AdditionPattern {
  private int startNum;
  private int number;
  private int increment;
  
  public AdditionPattern(int startNum, int increment) {
    this.startNum = startNum;
    this.number = startNum;
    this.increment = increment;
  }

  public int currentNumber() {
    return number;
  }

  public void next() {
    number += increment;
  }
  public void prev() {
    if (number > startNum) {
      number -= increment;
    }
  }
}
