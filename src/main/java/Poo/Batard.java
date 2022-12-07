package Poo;

public class Batard extends Chien {
    Mammifere pere;
    Mammifere mere;

    public Mammifere getPere() {
        return pere;
    }

    public void setPere(Mammifere pere) {
        this.pere = pere;
    }

    public Mammifere getMere() {
        return mere;
    }

    public void setMere(Mammifere mere) {
        this.mere = mere;
    }

    public Batard(int pattes, float taille, int poids,
                  int grosses,
                  String millieuNaturel, String type,
                  Mammifere pere, Mammifere mere) {
        super(pattes, taille, poids, grosses, millieuNaturel, type);
        this.mere = mere;
        this.pere = pere;
    }

    @Override
    public String getGrognement() {
        return "Je suis un BATARD!!!!";
    }
}
