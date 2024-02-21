
public class Customer implements DiscountRate{
    @Override
    public double getServiceDiscountRate() {
        return switch (customerType) {
            case "Premium" -> 0.2;
            case "Gold" -> 0.15;
            case "Silver" -> 0.1;
            default -> 0.0; // Normal customer
        };
    }

    @Override
    public double getProductDiscountRate() {
        return switch (customerType) {
            case "Premium" -> 0.1;
            case "Gold" -> 0.1;
            case "Silver" -> 0.1;
            default -> 0.0; // Normal customer
        };
    }

    String cusName;
    String cusType;

    public Customer(String cusName, String cusType) {
        this.cusName = cusName;
        this.cusType = cusType;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
