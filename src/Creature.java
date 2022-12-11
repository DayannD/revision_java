public class Creature {
    private String nom;
    Race race;
    private int age;

    public Creature(){
        this.nom = "DESHAYES";
        this.age = 42;
        this.race = Race.HUMAIN;
    }

    public Creature(String nom,Race race,int age){
        this.nom = nom;
        this.age = age;
        this.race = race;
    }

    public boolean isAdulte(){
      return false;
    }

    public void afficherInformations(){
        System.out.println("Mon nom est "+ this.nom +". Je suis un " + this.race +". Je suis un"+ (this.age < this.race.ageAdulte ? " adult" : " enfant"));
    }
}
