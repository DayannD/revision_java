package Poo;

public abstract class Vertebre {
    int pattes;
    float taille;
    int poids;

    public int getPattes() {
        return pattes;
    }

    public void setPattes(int pattes) {
        this.pattes = pattes;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Vertebre(int pattes, float taille, int poids) {
        this.pattes = pattes;
        this.taille = taille;
        this.poids = poids;
    }
}
