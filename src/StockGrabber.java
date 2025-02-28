import java.util.ArrayList;
public class StockGrabber implements ISubject {
    private ArrayList<IObserver> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver newObserver) {
        observers.add(newObserver);
    }
    @Override
    public void unregisterObserver(IObserver deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer deleted: " + (observerIndex + 1));
        observers.remove(observerIndex);
    }
    @Override
    public void notifyObservers() {
        for(IObserver observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObservers();
    }
    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }

}
