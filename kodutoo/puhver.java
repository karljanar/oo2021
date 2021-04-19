
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class puhver<S, V> implements funktsiooniliides<S, V> {
    funktsiooniliides<S, V> sorteerija;
    Map<S, V> hoidla = new HashMap<>();
    public puhver(funktsiooniliides<S, V> fliides){
        sorteerija = fliides;
    }

    public <T> List<T> sorteeri(T[] sisend) {
        if (!hoidla.containsKey(sisend)) {
            hoidla.put((S) sisend, (V) sorteerija.sorteeri(sisend));
        }
        System.out.println(hoidla);
        return (List<T>) hoidla.get(sisend);
    }
}
