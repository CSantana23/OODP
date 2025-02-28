public class StockObserver implements IObserver {

    private double googPrice;
    private double appPrice;
    private double ibmPrice;

    private static int observerIdTracker = 0;

    private int observerId;

    private ISubject stockGrabber;


    public StockObserver(ISubject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer: " + this.observerId);
        stockGrabber.registerObserver(this);
    }

    @Override
    public void update(double ibmPrice, double appPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.appPrice = appPrice;
        this.googPrice = googPrice;
        printThePrice();
    }

    private void printThePrice() {
        System.out.println(observerId + "\nIBM" + ibmPrice + "\nApp: " + appPrice + "\nGoog: " + googPrice);
    }
}
