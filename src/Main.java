import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
         String addition = "non payer";
        JFrame frame = new JFrame();
        int voler = 0;
        Restaurant restaurant = new Restaurant();
        String nomClient;
        int tailleTasse;
        TypeCafe[] choice = TypeCafe.values();

        nomClient = JOptionPane.showInputDialog(frame, "Bonjour, quel est votre nom");

        int servir = JOptionPane.showConfirmDialog(frame, "puis-je vous servire "+nomClient+" ?");

        /********Si oui on le sert ********/
        if (servir == 0){
            TypeCafe cafe = (TypeCafe) JOptionPane.showInputDialog(null, "Choose now...",
                    "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
                    // default
                    // icon
                    choice,
                    choice[0]);// Array of choices

            if (cafe == TypeCafe.BATARD){
                System.out.println("vous êtes pas le bien venu, DEHORS !!!!");
                System.exit(0) ;
            }

            Integer haveTasse = JOptionPane.showConfirmDialog(frame, "Avez-vous une tasse "+nomClient+" ?");

            if (haveTasse == 0){
                tailleTasse = Integer.parseInt(JOptionPane.showInputDialog(frame, "quelle taille ? "));
            }else {
                tailleTasse = 0;
            }

            JOptionPane optionPane = new JOptionPane();
            JSlider slider = getSlider(optionPane);
            optionPane.setMessage(new Object[] { "Select a value: ", slider });
            optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
            optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
            JDialog dialog = optionPane.createDialog(frame, "My Slider");
            dialog.setVisible(true);

            int quantiteCafe = (Integer) optionPane.getInputValue();
            System.out.println("Input: " + optionPane.getInputValue());



           Client client = createClient(haveTasse,cafe,quantiteCafe,tailleTasse,nomClient,restaurant);

           int convertisseur = convertir(client.valeurFacture);


            System.out.println(client.valeurFacture);

            while (!addition.equals("payer") || !addition.equals("voleur")){
                int argentClient = Integer.parseInt(JOptionPane.showInputDialog(
                        frame, "votre facture est de " +convertisseur+" centimes, Veuillez régler en centimes"  ));

                int payer = payement(convertisseur,argentClient);

                if (payer == 0){
                    addition = "payer";
                    JOptionPane.showMessageDialog(frame, "Merci d'avoir choisis notre restaurant,Au revoir");
                }else if (payer > 0){

                    JOptionPane.showMessageDialog(frame, "il vous reste "+payer+" à payé");
                    convertisseur = payer;
                    voler++;
                    if (voler == 3){
                        JOptionPane.showMessageDialog(frame, "Voleur!!!!");
                        break;
                    }
                } else if (payer < 0) {
                    addition = "payer";
                    Integer pourboire = JOptionPane.showConfirmDialog(frame, "Voulez-vous laisser un pourboire? ");
                    if (pourboire == 0){
                        JOptionPane.showMessageDialog(frame, "Merci d'avoir choisis notre restaurant,Au revoir");
                        break;
                    }else {
                        JOptionPane.showMessageDialog(frame,
                                "Merci d'avoir choisis notre restaurant,voici votre monnaie"+Math.abs(payer)+"Au revoir");
                        break;
                    }

                }
            }

        }
        //JOptionPane.showMessageDialog(frame, "Pri");

    }

    static int payement(int argent,int argentClient){
        return argent-argentClient;
    }

    static int convertir(double valeurFacture){
        return (int) (valeurFacture*100);
    }

    static Client createClient(Integer haveTasse,TypeCafe cafe,int quantiteCafe,
                                int tailleTasse,String nomClient,Restaurant restaurant)
    {
        Client client;
        if (haveTasse != null){
            Cafe clientCafe = new Cafe(cafe,quantiteCafe);
            Tasse tasse = new Tasse(tailleTasse);
            client = new Client(nomClient,clientCafe,tasse);

            restaurant.servir(client);
        } else {
            Cafe clientCafe = new Cafe(cafe,quantiteCafe);
            Tasse tasse = new Tasse();
            client = new Client(nomClient,clientCafe,tasse);
        }
        return client;
    }

    static JSlider getSlider(final JOptionPane optionPane) {
        JSlider slider = new JSlider(50,500);
        slider.setMajorTickSpacing(50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                JSlider theSlider = (JSlider) changeEvent.getSource();

                if (!theSlider.getValueIsAdjusting()) {
                    optionPane.setInputValue(new Integer(theSlider.getValue()));
                }
            }
        };
        slider.addChangeListener(changeListener);
        return slider;
    }

    /******************* EXO 3 **************************

     Random rand = new Random();

     List<Restaurant> resto = new ArrayList<>(Arrays.asList(
     new Restaurant(),
     new Restaurant("Une tasse de joie"),
     new Restaurant("Latte sur les Rochers")
     )
     );


     for (Integer i = 0; i < 3 ;i++){
     List<Client> client = new ArrayList<>();
     for (int j = 0; j < 20;j++){
     client.add(new Client(
     BanqueDeDonne.listeNoms.get(rand.nextInt(BanqueDeDonne.listeNoms.size())),
     BanqueDeDonne.listeCommandes.get(rand.nextInt(BanqueDeDonne.listeCommandes.size())),
     BanqueDeDonne.listeTasses.get(rand.nextInt(BanqueDeDonne.listeTasses.size()))
     ));
     }
     Client.mapClient.put(i,client);
     }

     for (List<Client> clientList: Client.mapClient.values()
     ) {
     for (Client client:
     clientList) {
     Restaurant restaurant = resto.get(rand.nextInt(resto.size()));
     if(restaurant.servir(client)){
     restaurant.listeClientServi.add(client);
     }else {
     restaurant.listeClientExpulse.add(client);
     }
     }
     }

     System.out.println(resto.get(0).getNom() +" j'ai servi "
     + resto.get(0).listeClientServi.size() +" client " + " et j'en est expulsé "+
     resto.get(0).listeClientExpulse.size());*/

    public static Restaurant checkFactureTotal(ArrayList<Client> listeClient) {
        Restaurant resto = new Restaurant() ;

        for(Client client : listeClient) {
            resto.servir(client) ;
        }

        return resto ;
    }

        };

