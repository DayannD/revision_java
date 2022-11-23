public class Cafetiere {

    public void remplirTasse(Tasse tasse){
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;
    }

    public void remplirTasse(Tasse tasse,TypeCafe typeCafe,double cafe){
        Cafe cafeChoice = new Cafe(typeCafe,cafe);
        tasse.cafe = cafeChoice;
    }

}
