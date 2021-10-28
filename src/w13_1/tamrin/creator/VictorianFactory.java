package w13_1.tamrin.creator;

import w13_1.tamrin.product.*;
import w13_1.tamrin.product.concrete.VictorianCaffeTerria;
import w13_1.tamrin.product.concrete.VictorianCahir;
import w13_1.tamrin.product.concrete.VictorianSofa;

public class VictorianFactory extends Factory{
    @Override
    public Chair createChair() {
        return new VictorianCahir();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CaffeTerria createCaffeTerria() {
        return new VictorianCaffeTerria();
    }
}
