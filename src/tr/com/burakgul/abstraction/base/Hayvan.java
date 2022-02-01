package tr.com.burakgul.abstraction.base;

import tr.com.burakgul.abstraction.interfaces.Boy;
import tr.com.burakgul.abstraction.interfaces.Kilo;

public abstract class Hayvan implements Boy, Kilo {
    protected Hayvan(int boy, int kilo){
        this.boy = boy;
        this.kilo = kilo;
    }
    private int boy;
    private int kilo;
    public abstract boolean canliMi();

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public int getKilo() {
        return kilo;
    }
}
