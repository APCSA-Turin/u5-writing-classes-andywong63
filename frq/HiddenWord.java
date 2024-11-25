public class HiddenWord {
  private String word;

  public HiddenWord(String word) {
    this.word = word;
  }

  public String getHint(String guess) {
    String result = "";
    for (int i = 0; i < word.length(); i++) {
      String character = guess.substring(i, i + 1);
      int index = word.indexOf(character);
      if (index == -1) {
        result += "*";
      } else if (index == i) {
        result += character;
      } else {
        result += "+";
      }
    }
    return result;
  }
}
