public class Restaurant {

    Cafetiere cafetiere;
    double profit;

    public Restaurant(){
        this.cafetiere = new Cafetiere();
    }

    public double servir(Client client){
        this.cafetiere.remplirTasse(client.tasse,client.commandeCafe.typeCafe,client.tasse.quantiteCafeMax);
        this.profit += client.valeurFacture;
        return client.valeurFacture;
    }
}
