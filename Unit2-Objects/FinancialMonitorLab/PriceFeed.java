public class PriceFeed {
    private String API_KEY = "dbu6u69r01qv51jak8p0dbu6u69r01qv51jak8pg";
    private int POLL_MS = 2000;
    private String symbol;
    private double lastPrice;
    private boolean first;

    public PriceFeed(String symbol) {
        this.symbol = symbol.toUpperCase();
        this.lastPrice = 0.0;
        this.first = true;
    }

    // Checkpoint simulation constructor: new PriceFeed(42, 10)
    public PriceFeed(long seed, int count) {
        this.lastPrice = 64000.00;
        this.first = true;
    }

    // public double fetchPrice() throws Exception {
    //     String address = "https://finnhub.io/api/v1/quote?symbol=" + symbol + "&token=" + API_KEY;
      
    // }

//     private String readUrl(String address) throws Exception {
       
//     }
// }