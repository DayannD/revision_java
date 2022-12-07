package Poo;

public abstract class Chien extends Canin {

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Chien(int pattes, float taille, int poids,
                 int grosses,
                 String millieuNaturel, String type) {
        super(pattes, taille, poids, grosses, millieuNaturel);
        this.type = type;
    }
}
