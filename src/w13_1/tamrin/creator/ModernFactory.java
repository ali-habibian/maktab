package w13_1.tamrin.creator;

import w13_1.tamrin.product.*;
import w13_1.tamrin.product.concrete.ModernCaffeTerria;
import w13_1.tamrin.product.concrete.ModernCahir;
import w13_1.tamrin.product.concrete.ModernSofa;

public class ModernFactory extends Factory{
    @Override
    public Chair createChair() {
        return new ModernCahir();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CaffeTerria createCaffeTerria() {
        return new ModernCaffeTerria();
    }
}
