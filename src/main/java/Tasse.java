public class Tasse {
    double quantiteCafeMax ;
    Cafe cafe ;

    Tasse() {
        quantiteCafeMax = 100 ;
    }

    public Tasse(double quantiteCafeMax) {
        super();
        this.quantiteCafeMax = quantiteCafeMax;
    }


    double boire(double qtBut) {
        cafe.quantiteLiquideMl = cafe.quantiteLiquideMl - qtBut ;
        return cafe.quantiteLiquideMl ;
    }

    void boire() {
        cafe.quantiteLiquideMl = 0 ;
    }

}