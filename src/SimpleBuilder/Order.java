package SimpleBuilder;
//@Builder
public class Order {
    private String customerName;
    private String address;
    private String coupon;
    private String note;
    private String paymentMethod;
    private boolean gift;

    public Order(Builder builder){
        this.customerName=builder.customerName;
        this.address=builder.address;
        this.coupon=builder.coupon;
        this.note=builder.note;
        this.paymentMethod=builder.paymentMethod;
        this.gift= builder.gift;
    }
    public static class Builder{
        private String customerName;
        private String address;
        private String coupon;
        private String note;
        private String paymentMethod;
        private boolean gift;

        public Builder customerName(String name){
            this.customerName=name;
            return  this;
        }
        public Builder address(String address){
            this.address=address;
            return this;
        }
        public Builder coupon(String coupon){
            this.coupon=coupon;
            return this;
        }
        public Builder note(String note){
            this.note=note;
            return this;
        }
        public Builder paymentMethod(String paymentMethod){
            this.paymentMethod=paymentMethod;
            return this;
        }
        public Builder gift(boolean gift){
            this.gift=gift;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
