package haltamrin.toyfactory;

public class Toy {
    private double basePrice;
    private ToySize size;

    public Toy(double basePrice, ToySize size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public Toy() {

    }

    public double getPrice(){
        return 0;
    }

    public double getPrice(double discount){
        return 0;
    }
}
