package v2;
import java.util.*;

public class sisend implements lylitatav{

    List<lylitatav> hoidla = new ArrayList<lylitatav>();
    public void lisa(lylitatav l){hoidla.add(l);}
    public void seisund(boolean sees){
        for(lylitatav l:hoidla){
            l.seisund(sees);
        }
    }
}
