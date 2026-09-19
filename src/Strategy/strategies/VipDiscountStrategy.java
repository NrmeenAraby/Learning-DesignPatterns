package Strategy.strategies;

public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price*0.20;
    }

    @Override
    public void collectDetails() {
        System.out.println("Vip Discount Strategy collects details");
    }
}
