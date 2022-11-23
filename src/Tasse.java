public class Tasse {
    double quantiteCafeMax;
    Cafe cafe;

    public Tasse(double quantite){
        this.quantiteCafeMax = quantite;
    }

    public double boire(double bu){
        this.cafe.quantiteLiquideMl-=bu;
        return this.cafe.quantiteLiquideMl;
    }

    public void boire(){
        this.cafe.quantiteLiquideMl = 0D;
    }
}
