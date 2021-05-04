
import java.util.*;

public class Toiduaine_andmed {


    static Hashtable<String, List<String>> ained = new Hashtable<>();

    public static List<String> kysiAine(String toidu_nimetus){return ained.get(toidu_nimetus);}


    public void lisaAine(String nimetus, double valgud, double rasvad, double sysivesikud){
        List<String> toiduaine = new ArrayList<>();
        if(ained.containsKey(nimetus)){
            System.out.println(nimetus + " ei lisa uuesti.");
        } else if(valgud + rasvad + sysivesikud > 100.0){
            System.out.println(nimetus + "i koostis ei saa uletada 100%.");
        }
        else {
            String strValgud = String.valueOf(valgud);
            String strRasvad = String.valueOf(rasvad);
            String strSysivesikud = String.valueOf(sysivesikud);
            toiduaine.add(strValgud);
            toiduaine.add(strRasvad);
            toiduaine.add(strSysivesikud);
            ained.put(nimetus, toiduaine);
        }
    }
}
