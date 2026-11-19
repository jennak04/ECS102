public class MarketMonitor {
    private double currentPrice;
    private double tickChange;
    private double highestPrice;
    private double lowestPrice;
    private int totalTicks;
    private double priceSum;

    //constructor
    public MarketMonitor(){
        currentPrice = 0.0;
        tickChange = 0.0;
        highestPrice = 0.0;
        lowestPrice = 0.0;
        totalTicks = 0;
        priceSum = 0.0;
    }

    public void processTick(String line){
        //parse line
        int spaceIndex = line.indexOf(" ");
        currentPrice = double.parseDouble(line.substring(0, spaceIndex));
        tickChange = double.parseDouble(line.substring(spaceIndex + 1));

        // update count and total
        totalTicks++;
        priceSum += currentPrice;

        // update highestprice and lowestprice

        if(totalTicks ==1){
            highestPrice = currentPrice;
            lowestPrice = currentPrice;
        } else if (currentPrice > highestPrice) {
            highestPrice = currentPrice;
        } else if (currentPrice < lowestPrice) {
            lowestPrice = currentPrice;
        }

    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public int getTotalTicks() {
        return totalTicks;
    }

    public double getAveragePrice() {
        if (totalTicks == 0) {
            return 0.0;
        }
        return priceSum / totalTicks;
    }

    public String toString() {
        return String.format(
            "Tick %d | Price: $%,.2f (%+.2f) | High: $%,.2f | Low: $%,.2f | Avg: $%,.2f",
            totalTicks,
            currentPrice,
            tickChange,
            highestPrice,
            lowestPrice,
            getAveragePrice()
        );
    }
}

