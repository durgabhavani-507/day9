public class Multiples {
    public static void main(String[] args) {
        int num = 7;
        int count = 10;

        System.out.println("The first " + count + " multiples of " + num + " are:");
        for (int i = 1; i <= count; i++) {
            System.out.print(num * i + " ");
        }
    }
}