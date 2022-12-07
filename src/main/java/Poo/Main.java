package Poo;

public class Main {
    public static void main(String[] args) throws Exception {
        Mammifere chat = new Chat(4,20,20,
                            3,"domestique",
                            "chaton",Etat.EN_VIE);
        System.out.println(chat.getPattes());


        Mammifere tigre = new Tigre(4,20,20,
                3,"sauvage",
                "puma",Etat.EN_VIE);
        System.out.println(tigre.getGrognement());


        Mammifere chien = new Nationalité(4,1,30,5,
                "domestique","bouldog",
                "Français");

        System.out.println(chien.getGrognement());

        Mammifere chienne = new Nationalité(4,1,30,5,
                "domestique","bouldog",
                "American");

        System.out.println(chienne.getGrognement());

        Mammifere batard = new Batard(4,3,50,10,
                                "dehors","batard",chien,chienne);

        System.out.println(batard.getGrognement());
    }
}
