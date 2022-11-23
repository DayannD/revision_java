import java.lang.reflect.Type;

public class Cafe {
    TypeCafe typeCafe;
    Double quantiteLiquideMl;

    public Cafe(){
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100D;
    }

    public Cafe(TypeCafe typeCafe, Double ml){
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = ml;
    }
}
