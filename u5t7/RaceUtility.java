package u5t7;

public class RaceUtility {
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km / 1.609;
    }

    public static String makeProper(String str) {
        String result = str.substring(0, 1).toUpperCase();
        for (int i = 0; i < str.length() - 1; i++) {
            String character = str.substring(i, i + 1);
            String nextChar = str.substring(i + 1, i + 2);
            if (character.equals(" ")) {
                result += nextChar.toUpperCase();
            } else {
                result += nextChar.toLowerCase();
            }
        }
        return result;
    }
}