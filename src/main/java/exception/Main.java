package exception;

public class Main {

    public static void main(String[] args) {

        Erreur.division();
        Erreur.outOf();
        try {
            Erreur.myException(300);
        } catch (ErreurCode e)
        {
            System.out.println(e.getCode());
        }

    }
}
