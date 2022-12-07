package Poo;

public class Nationalité extends Chien {
    String nationalité;

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public Nationalité(int pattes, float taille, int poids,
                       int grosses,
                       String millieuNaturel, String type, String nationalité) {
        super(pattes, taille, poids, grosses, millieuNaturel, type);
        this.nationalité = nationalité;
    }

    @Override
    public String getGrognement() {
        return "WOAF WOAF";
    }
}
