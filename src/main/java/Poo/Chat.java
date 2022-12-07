package Poo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Chat extends Felin{

    String nom;
    Etat etat;

    public Chat(int pattes, float taille, int poids, int grosses, String millieuNaturel, String nom, Etat etat) {
        super(pattes, taille, poids, grosses, millieuNaturel);
        this.nom = nom;
        this.etat = etat;
    }

    @Override
    public String getGrognement() {
        return "Miaou Miaou";
    }
}
