
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

    String customerName;
    String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}