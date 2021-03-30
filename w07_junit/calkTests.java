import org.junit.*;
import static org.junit.Assert.*;

public class calkTests {
    calc k = new calc();

    @Before
    public void puhasta(){
        k.vajutus("C");
    }

    @Test
    public void sisestus1(){
        assertEquals("0", k.kuvatav());
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
    }

    @Test
    public void sisestus2(){

        k.vajutus("3");
        k.vajutus("5");
        assertEquals("35", k.kuvatav());
    }

    @Test
    public void sisestus3(){

        k.vajutus("3");
        k.vajutus("5");
        k.vajutus("0");
        k.vajutus("5");
        assertEquals("3505", k.kuvatav());
        k.vajutus("C");
        assertEquals("0", k.kuvatav());
    }

    @Test
    public void arvutus1(){

        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("+");
        k.vajutus("5");
        assertEquals("5", k.kuvatav());
        k.vajutus("=");
        assertEquals("8.0", k.kuvatav());
    }

    @Test
    public void arvutus2(){

        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("-");
        k.vajutus("1");
        assertEquals("1", k.kuvatav());
        k.vajutus("=");
        assertEquals("2.0", k.kuvatav());
    }

    @Test
    public void arvutus3(){

        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("*");
        k.vajutus("5");
        assertEquals("5", k.kuvatav());
        k.vajutus("=");
        assertEquals("15.0", k.kuvatav());
    }

    @Test
    public void arvutus4(){

        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("/");
        k.vajutus("3");
        assertEquals("3", k.kuvatav());
        k.vajutus("=");
        assertEquals("1.0", k.kuvatav());
    }

    @Test
    public void arvutus5(){

        k.vajutus("5");
        assertEquals("5", k.kuvatav());
        k.vajutus("**");
        k.vajutus("2");
        assertEquals("2", k.kuvatav());
        k.vajutus("=");
        assertEquals("25.0", k.kuvatav());
    }


}
