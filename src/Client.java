public class Client {
    Tasse tasse;
    Cafe commandeCafe;
    String nom;
    double valeurFacture;


    public Client(String nom,Cafe com,boolean isClient) throws Exception{
        if (com == null){
            throw new Exception("DEHORS !!!!!");
        } else if (com.typeCafe == TypeCafe.BATARD) {
            throw new Exception("DEHORS !!!!!");
        }
        if (isClient){
            this.valeurFacture += 2;
        }
        if(com.quantiteLiquideMl > 100d){
            this.tasse = new Tasse(500d);
            this.valeurFacture += 3;
        } else{
            this.tasse = new Tasse(100d);
        }
        this.nom = nom;
        this.commandeCafe = com;
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
            this.valeurFacture = tasse.quantiteCafeMax * com.typeCafe.getCoutParMl() ;
        }

    public Client(){
        this.nom = "jean";
        this.tasse = new Tasse(100D);
    }
}
