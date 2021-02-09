import java.util.*;
public class proov2 {
    public static void main(String[] arg){
        Hashtable<String, Double> ht = new Hashtable<String, Double>();
        ht.put("juku", 4.0);
        ht.put("kati", 5.0);
        System.out.println(ht.get("juku"));
        for(String eesnimi: ht.keySet()){
            System.out.println(eesnimi + " - " + ht.get(eesnimi));
        }
    }
}