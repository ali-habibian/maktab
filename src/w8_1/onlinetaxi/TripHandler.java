package w8_1.onlinetaxi;

public class TripHandler {
    private static TripHandler handler;
    public static TripHandler getInstance(){
        if (handler == null)
            handler = new TripHandler();
        return handler;
    }

    private TripHandler(){

    }

    public int calcPrice(String type, TripParam params) {
        int distance = DistanceMap.distance[params.getSource()][params.getDestination()];
        if (type.equalsIgnoreCase("vip"))
            return new VipTripMethod().calcPrice(params) * distance;
        if (type.equalsIgnoreCase("economic"))
            return new EconomicTripMethod().calcPrice(params) * distance;
        if (type.equalsIgnoreCase("bike"))
            return new BikeTripMethod().calcPrice(params) * distance;
        System.out.println("Invalid type.");
        return -1;
    }

}
