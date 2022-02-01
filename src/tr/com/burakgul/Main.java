package tr.com.burakgul;

import tr.com.burakgul.abstraction.Insan;
import tr.com.burakgul.abstraction.base.Hayvan;

public class Main {

    public static void main(String[] args) {
        Insan instance = new Insan(100,56);
        // Bina instance = new Bina();
        System.out.println(instance.boyMetre());
        System.out.println(instance.boySantimetre());
        System.out.println(instance.boyKilometre());

        Hayvan hayvan = new Hayvan(110,98) {
            @Override
            public boolean canliMi() {
                return false;
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
            public int kiloKilogram() {
                return 0;
            }

            @Override
            public double kiloGram() {
                return 0;
            }
        };
    }
}
