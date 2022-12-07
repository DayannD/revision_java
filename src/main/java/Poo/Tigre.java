package Poo;

public class Tigre extends Felin{
    String nom;
    Etat etat;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Tigre(int pattes, float taille, int poids,
                 int grosses, String millieuNaturel,
                 String nom, Etat etat) {
        super(pattes, taille, poids, grosses, millieuNaturel);
        this.nom = nom;
        this.etat = etat;
    }

    @Override
    public String getGrognement() {
        return "GRRRRRRRRRRR";
    }
}
