public class Tasse {
    double quantiteCafeMax;
    Cafe cafe;

    public Tasse(){
        this.quantiteCafeMax = 100D;
    }

    public Double boire(Double bu){
        this.cafe.quantiteLiquideMl-=bu;
        return this.cafe.quantiteLiquideMl;
    }

    public void boire(){
        this.cafe.quantiteLiquideMl = 0D;
    }
}
