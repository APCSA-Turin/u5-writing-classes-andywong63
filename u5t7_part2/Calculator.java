package u5t7_part2;
import java.util.Scanner;

public class Calculator {
    public int menu(Scanner scanner) {
        System.out.println("Calculator");
        System.out.println("[1] Convert km to meters");
        System.out.println("[2] Convert meters to km");
        System.out.println("[3] Get area of a regular polygon");
        System.out.println("[4] Get perimeter of a regular polygon");
        int choice = askInt("Enter a number or -1 to quit", scanner);
        if (choice == 1) {
            convertToMeter(scanner);
        } else if (choice == 2) {
            convertToKm(scanner);
        } else if (choice == 3) {
            getPolygonArea(scanner);
        } else if (choice == 4) {
            getPolygonPerim(scanner);
        }
        return choice;
    }

    public void convertToMeter(Scanner scanner) {
        double km = askDouble("Enter the value of kilometers to convert to meters", scanner);
        System.out.println(km + " km is " + Converter.kmToMeter(km) + " meters");
    }
    
    public void convertToKm(Scanner scanner) {
        double meters = askDouble("Enter the value of meters to convert to kilometers", scanner);
        System.out.println(meters + " meters is " + Converter.meterToKm(meters) + " km");
    }
    
    public void getPolygonArea(Scanner scanner) {
        RegularPolygon polygon = askPolygon(scanner);
        System.out.println("Area: " + polygon.area());
    }

    public void getPolygonPerim(Scanner scanner) {
        RegularPolygon polygon = askPolygon(scanner);
        System.out.println("Perimeter: " + polygon.perimeter());
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != -1) {
            choice = menu(scanner);
            System.out.println();
        }
        scanner.close();
    }

    
    private RegularPolygon askPolygon(Scanner scanner) {
        int sides = askInt("Enter the number of sides of the polygon", scanner);
        double sideLen = askInt("Enter the length of the sides of the polygon (in cm)", scanner);
        return new RegularPolygon(sides, sideLen, "cm");
    }

    private double askDouble(String ask, Scanner scanner) {
        System.out.print(ask + ": ");
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }
    private int askInt(String ask, Scanner scanner) {
        System.out.print(ask + ": ");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}