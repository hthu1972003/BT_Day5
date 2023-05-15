package opp.btt_day5.b7_1;


public class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getServiceDiscountRate() {
        if (customer.isMember()) {
            if (customer.getMemberType().equals("Premium")) {
                return 0.2;
            } else if (customer.getMemberType().equals("Gold")) {
                return 0.15;
            } else if (customer.getMemberType().equals("Silver")) {
                return 0.1;
            }
        }
        return 0.0;
    }

    public double getProductDiscountRate() {
        if (customer.isMember()) {
            return 0.1;
        }
        return 0.0;
    }

    public double getServiceDiscountAmount() {
        return serviceExpense * getServiceDiscountRate();
    }

    public double getProductDiscountAmount() {
        return productExpense * getProductDiscountRate();
    }

    public double getTotalExpense() {
        double totalExpense = serviceExpense + productExpense;
        totalExpense -= getServiceDiscountAmount();
        totalExpense -= getProductDiscountAmount();
        return totalExpense;
    }

    @Override
    public String toString() {
        String discountInfo = "";
        if (getServiceDiscountAmount() > 0) {
            discountInfo += "Service Discount: $" + getServiceDiscountAmount() + "\n";
        }
        if (getProductDiscountAmount() > 0) {
            discountInfo += "Product Discount: $" + getProductDiscountAmount() + "\n";
        }

        return customer.toString() + "\n"
                + "Service Expense: $" + serviceExpense + "\n"
                + "Product Expense: $" + productExpense + "\n"
                + discountInfo
                + "Total Expense: $" + getTotalExpense();
    }

}