package Strategy.strategies;

public class StudentDiscountStrategy implements DiscountStrategy {

    public double calculateDiscount (double price){
        return price*0.15;
    }

    @Override
    public void collectDetails() {
        System.out.println("Student Discount Strategy collecting details");
    }
}
