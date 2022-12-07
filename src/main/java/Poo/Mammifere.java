package Poo;

public abstract class Mammifere  extends Vertebre{

    int grosses;

    public Mammifere(int pattes, float taille, int poids,int grosses) {
        super(pattes, taille, poids);
        this.grosses = grosses;
    }

    public int getGrosses() {
        return grosses;
    }

    public void setGrosses(int grosses) {
        this.grosses = grosses;
    }

    public abstract String getGrognement();
}
