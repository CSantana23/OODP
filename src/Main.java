public class Main {
    public static void main(String[] args) {


        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserverOne = new StockObserver(stockGrabber);
        StockObserver stockObserverTwo = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(50.00);
        stockGrabber.setGoogPrice(89.00);

        stockGrabber.unregisterObserver(stockObserverTwo);

    }
}