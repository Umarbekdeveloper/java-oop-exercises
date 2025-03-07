package oop_1.oop2;

public class StockTest {
    public static void main(String[] args) {
            Stock stock1 = new Stock("ORCL","Oracle Corparation");
            stock1.previousClosingPrice = 34.5;
            stock1.currentPrice = 34.35;

            System.out.println("stock1 getChangePrecent() >>>> " + stock1.getChangePercent());
    }
}
