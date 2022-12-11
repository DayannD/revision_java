import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vaisseau {
    Creature capitaine;
    List<Creature> passagers;
    List<CapsuleDeSecour> capsulesDeSecour;
    int nbMaximumPassager;

    public Vaisseau() {
        this.capitaine = new Creature("DESHAYES Dayann",Race.HUMAIN,42);
        this.capsulesDeSecour = new ArrayList<>(
                Arrays.asList(
                        new CapsuleDeSecour(),
                        new CapsuleDeSecour()
                        )
        );
        this.passagers = new ArrayList<>();
    }

    public Vaisseau(Creature capitaine, List<Creature> passagers,
                    int capsules,int nbMaximumPassager){
        this.capitaine = capitaine;
        this.passagers = passagers;
        this.nbMaximumPassager = nbMaximumPassager;
        this.capsulesDeSecour = new ArrayList<>();
        for (int i = 0; i < capsules; i++){
            this.capsulesDeSecour.add(new CapsuleDeSecour());
        }
    }

    public boolean ajouterPassager(Creature creature){
        if (passagers.size() >= nbMaximumPassager){
            System.out.println("il n'y a plus de place");
            return false;
        }
        passagers.add(creature);
        creature.afficherInformations();
        return true;
    }

    public void ajouterPassagerClandestin(Creature creature, int potDeVin){
        passagers.add(creature);
    }

    public boolean ajouterPassagerCapsuleSecour(){
        if(passagers == null || capsulesDeSecour == null || capsulesDeSecour.get(0).passagers.size() == this.capsulesDeSecour.get(0).nbMaximumPassager){
            System.out.println("ajout clandestin impossible");
            return false;
        }
        capsulesDeSecour.get(0).passagers.add(this.passagers.get(0));
        this.passagers.remove(0);
        return true;
    }
}
