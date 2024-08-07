public class CalculateCostPrice {
    public static void main(String[] args) {
        int totalSellingPrice = 15;
        double totalProfitPercentage = 20; 

        double costPriceOfOneItem = totalSellingPrice / (1 + (totalProfitPercentage / 100));

        System.out.println("Cost Price of one item: Rs. " + costPriceOfOneItem);
    }
}
