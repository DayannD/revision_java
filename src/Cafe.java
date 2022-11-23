import java.lang.reflect.Type;

public class Cafe {
    TypeCafe typeCafe;
    double quantiteLiquideMl;

    public Cafe(){
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100D;
    }

    public Cafe(TypeCafe typeCafe, double ml){
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = ml;
    }
}
