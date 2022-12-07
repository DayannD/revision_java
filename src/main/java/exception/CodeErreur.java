package exception;

public enum CodeErreur {

    STOP(1),
    VITESSE(2),
    PRIORITE(3),
    ;

    private int amende;
    CodeErreur(int amende) {
        this.amende = amende;
    }

    public int getAmende() {
        return amende;
    }
}
