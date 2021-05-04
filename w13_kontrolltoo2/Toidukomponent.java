import java.util.*;
public class Toidukomponent extends Toiduaine_andmed{


    Hashtable<String, List<String>> toidukomponent = new Hashtable<>();
    static Hashtable<String, Double> toiduKogussajasg = new Hashtable<>();
    public Hashtable<String, List<String>> kysiAineKogus(){return toidukomponent;}

    public void lisaKogus(String nimetus, double kogus){

        List<String> toiduaine = new ArrayList<>();
        List<String> toidu_andmed = Toidukomponent.kysiAine(nimetus);
        if(toidukomponent.containsKey(nimetus)){
            System.out.println(nimetus + " olemas, ei lisa uuesti.");
        } else {
            toiduKogussajasg.put(nimetus, kogus);
            double protsKogus = kogus / 100.0;
            double valgud = protsKogus * Double.parseDouble(toidu_andmed.get(0));
            double rasvad = protsKogus * Double.parseDouble(toidu_andmed.get(1));
            double sysivesikud = protsKogus * Double.parseDouble(toidu_andmed.get(2));

            toiduaine.add(String.valueOf(valgud));
            toiduaine.add(String.valueOf(rasvad));
            toiduaine.add(String.valueOf(sysivesikud));
            toidukomponent.put(nimetus, toiduaine);
        }
    }

    public String kysiRasv(String nimetus){
        return toidukomponent.get(nimetus).get(1);
    }
}
