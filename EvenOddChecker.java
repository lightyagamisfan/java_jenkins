public class EvenOddChecker {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Check if the number is even
                evenSum += i;
                System.out.println(i + " is even.");
            } else { // If not even, it must be odd
                oddSum += i;
                System.out.println(i + " is odd.");
            }
        }

        // Display the sum of even and odd numbers
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
