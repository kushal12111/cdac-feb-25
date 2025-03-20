// 7.

public class EvenOrOdd {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int number = Integer.parseInt(args[0]);
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}