package u5t7;

public class Temperature {
    private double high;
    private double low;
    private String unit;

    public Temperature(double high, double low, String unit) {
        this.high = high;
        this.low = low;
        if (unit.equals("F") || unit.equals("C")) {
            this.unit = unit;
        } else {
            this.unit = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return (temp * 9/5) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * 5/9;
    }


    public void changeToC() {
        if (unit.equals("C")) {
            return;
        }
        unit = "C";
        high = convertFtoC(high);
        low = convertFtoC(low);
    }

    public void changeToF() {
        if (unit.equals("F")) {
            return;
        }
        unit = "F";
        high = convertCtoF(high);
        low = convertCtoF(low);
    }

    public String tempInfo() {
        return "High Temperature: " + high + " " + unit
           + "\nLow Temperature: " + low + " " + unit;
    }
}