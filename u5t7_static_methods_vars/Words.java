package u5t7_static_methods_vars;

public class Words {
    private Words() {};

    public static boolean doesContain(String substr, String str) {
        return str.indexOf(substr) != -1;
    }

    public static void printReverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1) + " ");
        }
        System.out.println();
    }
}