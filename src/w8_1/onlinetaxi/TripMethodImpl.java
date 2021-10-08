package w8_1.onlinetaxi;

public class TripMethodImpl implements TripMethod {

    private double rainyRatio;
    private double peakTimeRatio;
    private double rainyAndPeakTimeRatio;
    private int basePrice;

    public TripMethodImpl(int basePrice, double rainyRatio, double peakTimeRatio, double rainyAndPeakTimeRatio) {
        this.basePrice = basePrice;
        this.rainyRatio = rainyRatio;
        this.peakTimeRatio = peakTimeRatio;
        this.rainyAndPeakTimeRatio = rainyAndPeakTimeRatio;
    }

    @Override
    public int calcPrice(TripParam params) {

        if (params.isPeakTime() && params.isRainy())
            return (int) (basePrice * rainyAndPeakTimeRatio);
        if (params.isRainy())
            return (int) (basePrice * rainyRatio);
        if (params.isPeakTime())
            return (int) (basePrice * peakTimeRatio);
        return basePrice;
    }
}
