package u5t7_part2;

public class RegularPolygon {
    private int sides;
    private double sideLen;
    private String unit;

    public RegularPolygon(int sides, double sideLen, String unit) {
        this.sides = sides;
        this.sideLen = sideLen;
        if (unit.equals("inches")) {
            this.unit = "inches";
        } else {
            this.unit = "cm";
        }
    }

    public int getSides() {
        return sides;
    }
    public double getSideLen() {
        return sideLen;
    }
    public String getUnit() {
        return unit;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    public void setSideLen(double sideLen) {
        this.sideLen = sideLen;
    }

    public double perimeter() {
        return sideLen * sides;
    }

    public double area() {
        // Area of a regular polygon formula:
        // A = (1/4)ns^2 * cot(pi / n)
        // n = number of sides
        // s = side length
        return (1/4.0) * sides * squareNum(sideLen) * cotangent(Math.PI / sides); //B, C, D
    }

    public void convertToCm() {
        if (unit.equals("cm")) return;
        unit = "cm";
        sideLen = Converter.inchToCm(sideLen); //E
    }
    public void convertToInches() {
        if (unit.equals("inches")) return;
        unit = "inches";
        sideLen = Converter.cmToInch(sideLen); //E
    }

    public void showInfo() {
        System.out.println("==============================");
        System.out.println("Side length: " + sideLen + " " + unit);
        System.out.println("Number of sides: " + sides);
        System.out.println("Area: " + area() + " square " + unit);
        System.out.println("Perimeter: " + perimeter() + " " + unit);
        System.out.println("==============================");
    }

    
    public static RegularPolygon randomSquare(int lower, int upper) {
        return new RegularPolygon(randomInt(lower, upper), 4, "inches");
    }

    private static int randomInt(int lower, int upper) {
        return (int) (Math.random() * (upper - lower) + 1) + lower;
    }

    private double cotangent(double num) {
        return 1 / Math.tan(num);
    }

    private static double squareNum(double num) {
        return Math.pow(num, 2);
    }
}
