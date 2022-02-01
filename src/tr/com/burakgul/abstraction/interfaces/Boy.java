package tr.com.burakgul.abstraction.interfaces;

public interface Boy {
    int a = 0;
    static String tanim(){
        return "Bu interface implemente eden classlar için bir sözleşme hükmündedir.";
    }
    double boySantimetre();
    double boyMetre();
    default double boyKilometre(){
        return 0;
    }
}
