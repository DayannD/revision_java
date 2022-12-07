package Poo;

public abstract class Felin extends Mammifere{

    String millieuNaturel;

    public String getMillieuNaturel() {
        return millieuNaturel;
    }

    public void setMillieuNaturel(String millieuNaturel) {
        this.millieuNaturel = millieuNaturel;
    }

    public Felin(int pattes, float taille, int poids, int grosses, String millieuNaturel) {
        super(pattes, taille, poids, grosses);

        this.millieuNaturel = millieuNaturel;
    }

}

