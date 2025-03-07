package oop_1.oop2;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock (String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return ((previousClosingPrice -currentPrice)/currentPrice)*100;
    }
}
