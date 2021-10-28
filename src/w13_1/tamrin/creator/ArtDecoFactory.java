package w13_1.tamrin.creator;

import w13_1.tamrin.product.*;
import w13_1.tamrin.product.concrete.ArtDecoCaffeTerria;
import w13_1.tamrin.product.concrete.ArtDecoCahir;
import w13_1.tamrin.product.concrete.ArtDecoSofa;

public class ArtDecoFactory extends Factory{
    @Override
    public Chair createChair() {
        return new ArtDecoCahir();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CaffeTerria createCaffeTerria() {
        return new ArtDecoCaffeTerria();
    }
}
