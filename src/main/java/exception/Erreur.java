package exception;

import java.util.ArrayList;
import java.util.List;

public class Erreur {

    public static void division() throws ArithmeticException{
        int a = 0;
        int b = 3;
        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("erreur");
        }
    }
    public  static void outOf() throws IndexOutOfBoundsException{
        List<String> tab = new ArrayList<>();
        tab.add("bonjour");

        try{
            for (int i = 0; i < 5;i++){
                tab.get(i);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("out of pos");
        }
    }

    public static void myException(int vitesse) throws ErreurCode{
        if (vitesse > 200){
            System.out.println("tu roule trop vite mon coco");
            throw new ErreurCode(CodeErreur.VITESSE);
        }
    }
}
