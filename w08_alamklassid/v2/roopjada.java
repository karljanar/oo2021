package v2;
import java.lang.reflect.Array;
import java.util.*;

public class roopjada extends tarbija2{
    Hashtable<String, tarbija2> hoidla = new Hashtable<String, tarbija2>();

    public void lisa(String type, tarbija2 t){hoidla.put(type ,t);}

    public double kysiTakistus(){
        double juhtivuss = 0;
        double juhtivusr = 0;
        int i = 0;
        String serial;
        Character seria;
        Character somethingsomethingchar = "serial".charAt(0);

        if(hoidla.size() == 0){return 99999999.0;}
        List<String> keys = new ArrayList<>(hoidla.keySet());
        for (tarbija2 t: hoidla.values()){
            serial = keys.get(i);
            seria = serial.charAt(0);
            if(seria.equals(somethingsomethingchar)) {
                juhtivuss += t.kysiTakistus();
            } else{
                juhtivusr += Math.pow(t.kysiTakistus(), -1);
            }

            i++;
        }
        if(juhtivusr > 0){
            juhtivusr = (double) Math.round(Math.pow(juhtivusr, -1) * 100d) / 100d;
            juhtivuss += juhtivusr;
        }


        return juhtivuss;
    }

    public double kysiMaxPinge(){
        double maxPinge=99999999.0;
        if(hoidla.size() == 0){return maxPinge;}
        for(tarbija2 t: hoidla.values()){
            double mp = t.kysiMaxPinge();
            if(mp < maxPinge){
                maxPinge = mp;
            }
        }
        return  maxPinge;
    }


    public double kysiMaxVoimsus() {
        return kysiMaxPinge()*kysiVool(kysiMaxPinge());
    }
}