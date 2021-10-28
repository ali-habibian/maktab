package w13_1.tamrin.creator;

import w13_1.tamrin.product.CaffeTerria;
import w13_1.tamrin.product.Chair;
import w13_1.tamrin.product.Sofa;

public abstract class Factory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CaffeTerria createCaffeTerria();
}
