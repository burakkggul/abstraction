package tr.com.burakgul.abstraction;

import tr.com.burakgul.abstraction.interfaces.Boy;

public class Bina implements Boy {
    public Bina(){

    }
    @Override
    public double boySantimetre() {
        return 0;
    }

    @Override
    public double boyMetre() {
        return 0;
    }

    @Override
    public double boyKilometre() {
        return Boy.super.boyKilometre();
    }
}
