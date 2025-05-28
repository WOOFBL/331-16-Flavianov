package app.utils;

public class DiscountCalculator {
    public static int calculateDiscount(double totalSales) {
        if (totalSales >= 300000) return 15;
        else if (totalSales >= 50000) return 10;
        else if (totalSales >= 10000) return 5;
        else return 0;
    }
}
