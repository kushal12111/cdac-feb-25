import java.util.Scanner;

class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total purchase amount
        System.out.print("Enter the total purchase amount (Rs): ");
        double totalPurchase = scanner.nextDouble();

        // Input membership status
        System.out.print("Do you have a membership card? (yes/no): ");
        boolean hasMembershipCard = scanner.next().equalsIgnoreCase("yes");

        double discount = 0;

        // Calculate base discount based on total purchase amount
        if (totalPurchase >= 1000) {
            discount = 20; // 20% discount
        } else if (totalPurchase >= 500) {
            discount = 10; // 10% discount
        } else {
            discount = 5; // 5% discount
        }

        // Increase discount by 5% if the user has a membership card
        if (hasMembershipCard) {
            discount += 5;
        }

        // Calculate final discount amount and total price after discount
        double discountAmount = totalPurchase * (discount / 100);
        double finalPrice = totalPurchase - discountAmount;

        // Display results
        System.out.println("Base Discount: " + discount + "%");
        System.out.println("Discount Amount: Rs " + discountAmount);
        System.out.println("Total Price After Discount: Rs " + finalPrice);
    }
}
