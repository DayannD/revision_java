package tddexo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Ballon {

    private int air;
    private boolean isBoom = false;

    public Ballon(int air){
        if(air>100){
            return;
        }
        this.air = air;
    }

    public void gonfleBallon(int air){
        if(isBoom == true)
            return;

        this.air += air;
        if (this.air <= 100){
            return;
        }

        ballonExploser();
    }

    public void ballonExploser(){
        this.air = 0;
        this.isBoom = true;
    }
}
