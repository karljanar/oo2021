import org.junit.*;
import static org.junit.Assert.*;

public class Kontroll1{
    @Test
    public void esimene(){
        System.out.println("Testi automaatkäivitus");
    }
    @Test
    public void arvutus1(){
        assertEquals(6, Tehted.geoKesk(4, 9), 0.001);
    }
    @Test
    public void arvutus2(){
        assertEquals(3, Tehted.geoKesk(1, 3, 9), 0.001);
    }


    @Test
    public void arvutus4(){
        assertEquals(30, Tehted.harmoonilineKeskmine(60, 20), 0.001);
    }
}