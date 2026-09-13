package Strategy;

public class DiscountService {
    private  DiscountStrategy discountStrategy;
    public DiscountService(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
    public double applyDiscount(double price){
        return discountStrategy.calculateDiscount(price);
    }
}
