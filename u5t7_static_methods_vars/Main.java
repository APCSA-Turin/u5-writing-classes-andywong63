package u5t7_static_methods_vars;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println("Area of square 1: " + square1.getArea());
        System.out.println("Total squares: " + Square.getTotalSquares());
        Square square2 = new Square(7);
        System.out.println("Area of square 2: " + square2.getArea());
        System.out.println("Total squares: " + Square.getTotalSquares());
    }
}