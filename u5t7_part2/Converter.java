package u5t7_part2;

public class Converter {
    private Converter() {}

    public static double inchToCm(double inches) {
        return inches * 2.54;
    }

    public static double cmToInch(double cm) {
        return cm / 2.54;
    }

    public static double kmToMeter(double km) {
        return moveDecimalPlace(km, 3); //A
    }

    public static double meterToKm(double meters) {
        return moveDecimalPlace(meters, -3); //A
    }

    private static double moveDecimalPlace(double number, int change) {
        return number * Math.pow(10, change);
    }
}