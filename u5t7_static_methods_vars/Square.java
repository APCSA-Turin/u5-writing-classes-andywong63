package u5t7_static_methods_vars;

public class Square {
    private int sideLen;
    private static int totalSquares;

    public Square(int sideLen) {
        this.sideLen = sideLen;
        totalSquares++;
    }

    public int getArea() {
        return sideLen * sideLen;
    }

    public static int getTotalSquares() {
        return totalSquares;
    }
}