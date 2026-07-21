public class Divisors {
    public static void main(String[] args) {
        int number = 36; // Example number to find divisors for
        System.out.println("Divisors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
