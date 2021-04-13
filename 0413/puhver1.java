import java.util.HashMap;
import java.util.Map;

public class puhver1 {
    Map<Integer, Integer> hoidla = new HashMap();
    public int faktoriaal(int arv){
        if(!(hoidla.containsKey(arv))){
            int abi = 1;
            for (int i = 1; i<=arv; i++){
                abi = abi * i;
            }
            hoidla.put(arv, abi);
        }
        System.out.println(hoidla);
        return hoidla.get(arv);
    }

    Map<Integer, String> hoidla2 = new HashMap();
    public String paaris(int arv){
        if(!(hoidla2.containsKey(arv))){
            String abi;
            if(arv % 2 == 0){
                abi = "paaris";
            } else {
                abi = "paaritu";
            }
            hoidla2.put(arv, abi);
        }
        System.out.println(hoidla2);
        return hoidla2.get(arv);
    }

    public static void main(String[] arg){
        puhver1 p = new puhver1();
        /*System.out.println(p.faktoriaal(5));
        System.out.println(p.faktoriaal(3));
        System.out.println(p.faktoriaal(5));*/

        System.out.println(p.paaris(5));
        System.out.println(p.paaris(4));
        System.out.println(p.paaris(5));


    }
}
