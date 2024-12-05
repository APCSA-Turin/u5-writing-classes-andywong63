public class Main {
    public static void main(String[] args) {
        KeyGenerator gen = new KeyGenerator("shone");
        System.out.println(gen.getKey().getPassword());
    }
}
