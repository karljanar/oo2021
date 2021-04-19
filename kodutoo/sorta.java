import java.util.ArrayList;
import java.util.List;


public class sorta implements funktsiooniliides<Integer, Integer> {


    public <V> List<V> sorteeri(V[] m){
        List<V> vastus = new ArrayList<>();

        V tem;
        for (int i = 0; i<m.length; i++){
            for(int x = i+1; x<m.length; x++){
                int min = Integer.valueOf((Integer) m[i]);
                int ma = Integer.valueOf((Integer) m[x]);
                if(min > ma){
                    tem = m[i];
                    m[i] = m[x];
                    m[x] = tem;
                }
            }
            vastus.add(m[i]);
        }
        return vastus;

        }

}
