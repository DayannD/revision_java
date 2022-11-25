public class Cafetiere {

    public void remplirTasse(Tasse tasse){
        Cafe cafe = new Cafe(TypeCafe.MOKA,tasse.quantiteCafeMax);
        tasse.cafe = cafe;
    }

    public void remplirTasse(Tasse tasse,TypeCafe typeCafe,double cafe){
        Cafe cafeChoice = new Cafe(typeCafe,cafe);
        tasse.cafe = cafeChoice;

    }

}
