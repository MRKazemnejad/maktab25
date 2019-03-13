public class Billing {
    private double bookPrice;
    private int quantity;
    private int coupon;
    private double tax=0.08;

    public void setBookName(double bookName) {
        this.bookPrice = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double computeBill(double bookPrice){
        double result=bookPrice*tax;
        bookPrice=result+bookPrice;
        return bookPrice;
    }
    public double computeBill(double bookPrice,int quantity){
        double result=bookPrice*quantity;
        double newBookPrice=result*tax;
        result=result+newBookPrice;
        return result;
    }
    public double computeBill(double bookPrice,int quantity,int coupon){
        double result=(bookPrice*quantity)-coupon;
        double newBookPrice=result*tax;
        result=newBookPrice+result;
        return result;
    }
}
