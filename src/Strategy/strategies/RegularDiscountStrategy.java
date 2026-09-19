package Strategy.strategies;

public class RegularDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        return price*0.05;
    }

    @Override
    public void collectDetails() {
        System.out.println("Regular Discount Strategy collecting details");
    }
}
