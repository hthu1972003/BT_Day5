package opp.btt_day5.b7_1;


public class Discount {
    private static final double PREMIUM_SERVICE_DISCOUNT = 0.2;
    private static final double GOLD_SERVICE_DISCOUNT = 0.15;
    private static final double SILVER_SERVICE_DISCOUNT = 0.1;
    private static final double PRODUCT_DISCOUNT_PREMIUM = 0.1;
    private static final double PRODUCT_DISCOUNT_GOLD = 0.1;
    private static final double PRODUCT_DISCOUNT_SILVER = 0.1;

    public static double getServiceDiscountRate(Customer customer) {
        if (customer.isMember()) {
            String memberType = customer.getMemberType();
            if (memberType.equals("Premium")) {
                return PREMIUM_SERVICE_DISCOUNT;
            } else if (memberType.equals("Gold")) {
                return GOLD_SERVICE_DISCOUNT;
            } else if (memberType.equals("Silver")) {
                return SILVER_SERVICE_DISCOUNT;
            }
        }
        return 0.0;
    }

    public static double getProductDiscountRate(Customer customer) {
        if (customer.isMember()) {
            String memberType = customer.getMemberType();
            if (memberType.equals("Premium")) {
                return PRODUCT_DISCOUNT_PREMIUM;
            } else if (memberType.equals("Gold")) {
                return PRODUCT_DISCOUNT_GOLD;
            } else if (memberType.equals("Silver")) {
                return PRODUCT_DISCOUNT_SILVER;
            }
        }
        return 0.0;
    }
}
