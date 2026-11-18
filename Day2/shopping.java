import java.util.function.*;

@FunctionalInterface
interface Payable {
    double calculate(double amount);
}

public class shopping {
    public static void main(String[] args) {

        Runnable welcome = () -> System.out.println("Welcome to Shopping Application!");

        Function<Double, Double> gst = price -> price * 0.18;

        BiFunction<Double, Integer, Double> bill = (price, qty) -> price * qty;

        Function<Double, Double> discount = amount -> amount * 0.10;

        Payable payable = amount -> {
            double d = amount * 0.10;
            double finalAmount = amount - d;
            return finalAmount;
        };

        double price = 1000;
        int quantity = 2;

        welcome.run();

        double gstAmount = gst.apply(price);
        System.out.println("GST: " + gstAmount);

        double totalBill = bill.apply(price, quantity);
        System.out.println("Total Bill: " + totalBill);

        double discountAmount = discount.apply(totalBill);
        System.out.println("Discount: " + discountAmount);

        double finalAmount = payable.calculate(totalBill);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}