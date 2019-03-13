import java.util.Scanner;

public class BillingManagment {
    public static void main(String[] args) {
        Billing bill=new Billing();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your book price: ");
        double bookPrice=scanner.nextDouble();
        System.out.println("Enter quantity of book: ");
        int quantity=scanner.nextInt();
        System.out.println("Enter your coupon: ");
        int coupon=scanner.nextInt();
        System.out.format("You must pay:%3.2f ",bill.computeBill(bookPrice,quantity,coupon));
    }
}
