public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = (a = 8);
        System.out.println(b);
    }
}
