import java.util.Scanner;

public class BillingManagment {
    public static void main(String[] args) {
        Billing bill=new Billing();
        Scanner scanner=new Scanner(System.in);
        System.out.println(bill.computeBill(5,3,2));
    }
}
