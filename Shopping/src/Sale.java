public class Sale{

    Customer customer;
    String date;
    double serviceExpence;
    double productExpence;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public double getServiceExpence() {
        return serviceExpence;
    }

    public void setServiceExpence(double serviceExpence) {
        this.serviceExpence = serviceExpence;
    }

    public double getProductExpence() {
        return productExpence;
    }

    public void setProductExpence(double productExpence) {
        this.productExpence = productExpence;
    }

    double getTotalExpense() {
        double totalServiceExpense = getServiceExpence() * (1 - customer.getServiceDiscountRate());
        double totalProductExpense = getServiceExpence() * (1 - customer.getProductDiscountRate());
        return totalServiceExpense + totalProductExpense;
    }


    void DisplayInfo() {
        System.out.println("Sale{" +
                "customer=" + customer +
                ", date='" + date + '\'' +
                ", serviceExpence=" + serviceExpence +
                ", productExpence=" + productExpence +
                ", totalExpense=" + getTotalExpense() +
                '}');
    }



}