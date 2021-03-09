import java.util.ArrayList;
import java.util.List;

public class eraldusteJarjestKaiv implements  tekstistEraldaja{
    List<tekstistEraldaja> osad = new ArrayList<tekstistEraldaja>();
    public void lisa(tekstistEraldaja t){
        osad.add(t);
    }

    public String eralda(String s){

        for(tekstistEraldaja te: osad){
            s = te.eralda(s);
        }
        return s;
    }
}
