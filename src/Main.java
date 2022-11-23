import com.sun.source.tree.ContinueTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int annee = -3000;
        Byte nbClanMenbers = 127;
        Long nbChanceux = 8589934592L;
        String nomClan = "Pierre";
        char modifNom = 'e';
        boolean isFeuilleLetal = false;
        boolean isGrosseBrancheLetal = true;
        float eauEnPeauDeMammouth = 10.5f;
        Float eauTotal = 123456789012345678901234567890.12345678901234567890F;

        System.out.println("Nous somme en " + annee + " av. J.-C, mon nom est " + nomClan + modifNom + " et je suis un brillant scientifique (Mon nombre favori est " + nbChanceux + ", gros chiffre gros cerveau !)\nJe suis un des " + nbClanMenbers + " membres du clan des " + nomClan + "\n\nMes recherches m'ont permis de découvrir que frapper quelqu’un avec une feuille d'arbre " + (isFeuilleLetal ? "est mortel" : "n'est pas mortel") + ".\nCependant le frapper avec une grosse branche du même arbre " + (isGrosseBrancheLetal ? "est mortel" : "n'est pas mortel") + "!\n\nJ'ai également calculé que notre réserve d'eau s'élève actuellement à exactement " + eauEnPeauDeMammouth + " PMP (Peau de Mammouth Pleine).\nJ'estime que la réserve de l'océan s'élève à environ " + eauTotal + " PMP ! \n\n" );*/

        Scanner scanner = new Scanner(System.in);
        Methode methode = new Methode();
        Integer a = null;
        Integer b = null;
        boolean isOk = true;

        while (isOk){
            try{
                System.out.println("entrer le 1 nombre à additionner");
                a = scanner.nextInt();
                System.out.println("entrer le 2 nombre à additionner");
                b = scanner.nextInt();
            }catch (InputMismatchException ime){
                System.err.println("reessayer");
                scanner.nextLine();
            }finally {
                if (a == null || b == null ){
                    continue;
                }
                scanner.close();
                isOk = false;
            }
        }

        System.out.println("Le résultat est " + methode.addition(a,b));
    }
}