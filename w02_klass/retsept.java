import java.util.*;

public class retsept{
    Hashtable <String, Double> ained = new Hashtable<String, Double>();
    public Set kysiAined(){return ained.keySet();}
    public Hashtable<String, Double> kysiAine(){return ained;}
    public void lisa(String aine, double kogus){
        if(ained.containsKey(aine)){
            //throw new RuntimeException(aine + " juba olemas.");
            System.out.println(aine + " juba olemas, lisan uue koguse.");
            ained.put(aine, ained.get(aine) + kogus);
        } else {
            ained.put(aine, kogus);
        }
    }
    public double koguMass(){
        double summa=0;
        for(double kogus: ained.values()){
            summa += kogus;

        }
        return summa;
    }
    public retsept koopia(double koef){
        retsept uus = new retsept();
        for(String aine: ained.keySet()){
            uus.lisa(aine, koef*ained.get(aine));
        }
        return uus;
    }

    public retsept soovitudMassigaKoopia(double grammid){
        double summa = koguMass();
        double koef = grammid/summa;
        retsept uus = new retsept();
        for(String aine: ained.keySet()){
            uus.lisa(aine, koef*ained.get(aine));
        }
        return uus;


    }
}
