import java.util.ArrayList;
import java.util.List;


public class sortChar implements funktsiooniliides<Character, Character> {


    public <V> List<V> sorteeri(V[] m){
        List<V> vastus = new ArrayList<>();

        V tem;
        for (int i = 0; i<m.length; i++){
            for(int x = i+1; x<m.length; x++){
                Character minc = m[i].toString().charAt(0);
                Character mac = m[x].toString().charAt(0);
                int min = minc;
                int ma = mac;
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
