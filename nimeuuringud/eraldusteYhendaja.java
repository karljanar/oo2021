import java.util.ArrayList;
import java.util.List;

public class eraldusteYhendaja implements  tekstistEraldaja{
    List<tekstistEraldaja> osad = new ArrayList<tekstistEraldaja>();
    public void lisa(tekstistEraldaja t){
        osad.add(t);
    }

    public String eralda(String s){
        StringBuffer sb = new StringBuffer();
        for(tekstistEraldaja te: osad){
            sb.append(te.eralda(s));
        }
        return sb.toString();
    }
}
