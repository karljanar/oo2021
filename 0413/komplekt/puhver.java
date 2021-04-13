package komplekt;

import java.util.HashMap;
import java.util.Map;

public class puhver<S, V> implements funktsiooniliides<S, V>{
    funktsiooniliides<S, V> arvutaja;
    Map<S, V> hoidla = new HashMap();
    public puhver(funktsiooniliides<S, V> fliides){
        arvutaja = fliides;
    }

    public V arvuta(S sisend) {
        if (!hoidla.containsKey(sisend)) {
            hoidla.put(sisend, arvutaja.arvuta(sisend));
        }
        System.out.println(hoidla);
        return hoidla.get(sisend);
    }
}
