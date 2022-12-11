import java.util.ArrayList;
import java.util.List;

public class CapsuleDeSecour {

    List<Creature> passagers;
    int nbMaximumPassager;
    boolean isInSpace;

    public CapsuleDeSecour(){
        this.passagers = new ArrayList<>();
        this.isInSpace = false;
        this.nbMaximumPassager = 3;
    }

    public boolean ajouterPassager(Creature creature){
        if(passagers.size() >= nbMaximumPassager){
            System.out.println("il y a actuellement " + (passagers.size()-nbMaximumPassager) +" de disponible" );
            return false;
        }
        passagers.add(creature);
        return true;
    }

    public List<Creature> lanceCapsule(){
        this.isInSpace = true;
        return this.passagers;
    }
}
