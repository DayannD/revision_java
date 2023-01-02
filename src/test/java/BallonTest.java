import org.junit.Assert;
import org.junit.Test;
import tddexo.Ballon;

public class BallonTest {

    @Test
    public void ajoutBallon(){
        Ballon ballon = new Ballon(100);

        Assert.assertTrue(ballon.getAir() == 100);
    }

    @Test
    public void gonfleBallon(){
        Ballon ballon = new Ballon(100);
        ballon.gonfleBallon(10);
        Assert.assertEquals(true, ballon.isBoom() );
    }

    @Test
    public void ballonExplose(){
        Ballon ballon = new Ballon(100);
        ballon.gonfleBallon(10);
        Assert.assertTrue(ballon.getAir() == 0);
    }
}
