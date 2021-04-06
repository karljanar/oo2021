package v2;
import java.util.*;

public class jada extends tarbija2{
    List<tarbija2> hoidla = new ArrayList<tarbija2>();

    public void lisa(tarbija2 t){hoidla.add(t);}

    public double kysiTakistus(){
        double juhtivus = 0;
        if(hoidla.size() == 0){return 99999999.0;}
        for(tarbija2 t: hoidla){
            juhtivus += t.kysiTakistus();
        }
        return juhtivus;
    }

    public double kysiMaxPinge(){
        double maxPinge=99999999.0;
        if(hoidla.size() == 0){return maxPinge;}
        for(tarbija2 t: hoidla){
            double mp = t.kysiMaxPinge();
            if(mp < maxPinge){
                maxPinge += mp;
            }
        }
        return  maxPinge;
    }


    public double kysiMaxVoimsus() {
        return kysiMaxPinge()*kysiVool(kysiMaxPinge());
    }
}