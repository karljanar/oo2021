import java.util.Hashtable;
import java.util.List;

public class Toit extends Toidukomponent{

    static Hashtable<String, List<String>> toidud = new Hashtable<>();
    //public Hashtable<String, List<String>> kysiToidud(){return toidud;}
    public static List<String> kysiToit(String nimetus){return toidud.get(nimetus);}

    static Hashtable<String, Double> retsept = new Hashtable<>();

    public void lisaToit(String nimetus, List<String> komponent){

        if(toidud.containsValue(komponent)){
            System.out.println(komponent + " olemas, ei lisa uuesti.");
        } else {
            toidud.put(nimetus, komponent);
        }
    }

    public void kysiToiteVaartus(String toiduNimetus){
        double valgud = 0;
        double rasvad = 0;
        double sysivesikud = 0;
        for(int i = 0; i<toidud.get(toiduNimetus).size(); i++){
            valgud += Double.parseDouble(toidukomponent.get(toidud.get(toiduNimetus).get(i)).get(0));
            rasvad += Double.parseDouble(toidukomponent.get(toidud.get(toiduNimetus).get(i)).get(1));
            sysivesikud += Double.parseDouble(toidukomponent.get(toidud.get(toiduNimetus).get(i)).get(2));
        }
        System.out.println("Valgud: " + valgud + " Rasvad: " + rasvad + " Sysivesikud: " + sysivesikud);
    }

    public void kysiRetseptiKogus(String toidunimetus, double kogus){
        double realkogus = kogus * 10.0;
        for(int i = 0; i<toidud.get(toidunimetus).size(); i++) {
            retsept.put(((kysiToit(toidunimetus)).get(i)), realkogus * Toidukomponent.toiduKogussajasg.get((kysiToit(toidunimetus))
                    .get(i)));
        }
        System.out.println(retsept);
    }
}
