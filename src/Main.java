import javax.swing.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int variable = 0;
        Methode additionChiffre = new Methode();
/*
        try{
            variable = Integer.parseInt(JOptionPane.showInputDialog(frame,"Entrez votre nombre:"));
        }catch (InputMismatchException ime){
            System.err.println("Vous avez rentrer une mauvaise donnée");
        }

        JOptionPane.showMessageDialog(
                frame,
                "Le résultat est "+ additionChiffre.additionChiffre(variable) ,
                "Result",
                JOptionPane.YES_OPTION
        );*/

        if (additionChiffre.dès()){
            JOptionPane.showMessageDialog(
                    frame,
                    "A zut tu as GAGNER !!!!!!!!!!",
                    "Winner !!!!!",
                    JOptionPane.ALLBITS);
        }else {
            JOptionPane.showMessageDialog(
                    frame,
                    "A zut tu as PERDU !!!!!!!!!!",
                    "LOOSER !!!!!",
                    JOptionPane.ERROR_MESSAGE);
        }



        for(int i; i < maxHorizontal;i++){
            for (int v=0; v < maxV; v++){
                if (i == valeurTresorH && v == valeurTresorV){
                    System.out.println("Bravo !!! ");
                }
            }
        }
    }
}