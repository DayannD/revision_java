public class Client {
    Tasse tasse;
    Cafe commandeCafe;
    String nom;
    double valeurFacture;


    public Client(String nom,Cafe com,boolean isClient){
        this.nom = nom;
        this.commandeCafe = com;
        this.tasse.cafe = com;
    }

    public Client(){
        this.nom = "jean";
        this.tasse.quantiteCafeMax = 100D;
    }
}
