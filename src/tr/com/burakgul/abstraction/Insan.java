package tr.com.burakgul.abstraction;

import tr.com.burakgul.abstraction.base.Hayvan;

public class Insan extends Hayvan {
    public Insan(int boy, int kilo){
        super(boy,kilo);
    }
    @Override
    public boolean canliMi() {
        return true;
    }

    @Override
    public double boySantimetre() {
        return this.getBoy();
    }

    @Override
    public double boyMetre() {
        return this.getBoy()/100.0;
    }

    @Override
    public int kiloKilogram() {
        return this.getBoy();
    }

    @Override
    public double kiloGram() {
        return this.getBoy()/100.0;
    }
}
