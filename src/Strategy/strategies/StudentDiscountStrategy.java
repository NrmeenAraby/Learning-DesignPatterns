package Strategy;

public class StudentDiscount implements DiscountStrategy{

    public double calculateDiscount (double price){
        return price*0.15;
    }
}
