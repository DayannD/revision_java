import org.junit.After;
import org.junit.Test;
import org.junit.*;


public class CafetiereTest {
    
    @Test
    public void vrai(){

        Assert.assertTrue(5 < 10);
    }

    @Test
    public void faux(){

        Assert.assertFalse(5 > 10);
    }

    @Test
    public void testTasse(){
        Tasse tasse = new Tasse();
        Assert.assertTrue(tasse.quantiteCafeMax == 100.0);
    }

    @Test
    public void but(){
        Tasse tasse = new Tasse();
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;
        tasse.boire();
        Assert.assertTrue(tasse.cafe.quantiteLiquideMl == 0);
    }

    @Test
    public void batard(){
        Tasse tasse = new Tasse();
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;
        System.out.println(tasse.cafe.typeCafe);
        tasse.boire(50.0);
        Cafetiere cafetiere = new Cafetiere();
        cafetiere.remplirTasse(tasse,TypeCafe.BOURBON,39);
        System.out.println(cafe.typeCafe+ " " +tasse.cafe.quantiteLiquideMl);
        Assert.assertSame(tasse.cafe.typeCafe,TypeCafe.BATARD);
    }

    @Test
    public void toMore(){
        Tasse tasse = new Tasse();
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;

        tasse.boire(150);
        System.out.println(tasse.cafe.quantiteLiquideMl);
        Assert.assertTrue(tasse.cafe.quantiteLiquideMl == -50);
    }

    @Test
    public void toMoreCorriger(){
        Tasse tasse = new Tasse();
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;

        tasse.boire(150);
        System.out.println(tasse.cafe.quantiteLiquideMl);
        Assert.assertTrue(tasse.cafe.quantiteLiquideMl == 0);
    }

    @Test
    public void client(){
        Tasse tasse = new Tasse();
        Cafe cafe = new Cafe();
        tasse.cafe = cafe;
        Client client = new Client("Pierre",tasse.cafe,tasse);
        Restaurant restaurant = new Restaurant();

        Assert.assertTrue(restaurant.servir(client) == true);
    }

}
