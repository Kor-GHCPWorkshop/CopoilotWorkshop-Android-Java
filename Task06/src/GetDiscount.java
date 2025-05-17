public class GetDiscount {
    public static double getDiscountedPrice(double price, String customerType) {
        if (customerType.equals("regular")) {
            if (price > 100) {
                return price * 0.9;
            } else {
                return price;
            }
        } else if (customerType.equals("member")) {
            if (price > 100) {
                return price * 0.85;
            } else {
                return price * 0.95;
            }
        } else if (customerType.equals("vip")) {
            if (price > 100) {
                return price * 0.8;
            } else {
                return price * 0.9;
            }
        } else {
            return price;
        }
    }
}



