public class MonitorRunner {
    public static void main(String[] args) throws Exception {
        PriceFeed feed = new PriceFeed("AAPL");
        MarketMonitor monitor = new MarketMonitor();

        String line = feed.readLine();
        while(line != null) {
            monitor.processTick(line);
            System.out.println(monitor);
            line = feed.readLine();
        }
    }
}
