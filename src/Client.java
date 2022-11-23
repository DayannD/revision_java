public class Client {
    Tasse tasse;
    Cafe commandeCafe;
    String nom;
    double valeurFacture;


    public Client(String nom,Cafe com,boolean isClient){
        if (com.typeCafe == TypeCafe.BATARD){
            System.err.println("DEHORS");
            this.valeurFacture = 0;
            return;
        } else if (com == null) {
            System.err.println("DEHORS");
            this.valeurFacture = 0;
            return;
        }
        if (isClient){
            this.valeurFacture += 2;
        }
        this.nom = nom;
        this.commandeCafe = com;
        this.tasse = new Tasse(100d);
    }

    public Client(String nom,Cafe com,Tasse tasse){
        if (com.typeCafe == TypeCafe.BATARD){
            System.err.println("DEHORS");
            this.valeurFacture = 0;
            return;
        } else if (com == null) {
            System.err.println("DEHORS");
            this.valeurFacture = 0;
            return;
        }
            this.nom = nom;
            this.commandeCafe = com;
            this.tasse = tasse;
        }

    public Client(){
        this.nom = "jean";
        this.tasse.quantiteCafeMax = 100D;
    }
}
