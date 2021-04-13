import java.util.HashMap;
import java.util.Map;

public class proov1 {
    public static void main(String[] arg){
        Object ob1 = "Tere";
        Object ob2 = 7;

        System.out.println(ob1 + ", " + ob2);

        if(ob2 instanceof Integer){
            int arv = (int)ob2 +1;
            System.out.println(arv);
        }

        Object obm = new int[]{1, 2, 3};
        for(int arv:(int[])obm){
            System.out.println(arv);
        }

        Map<String, Integer> tulemused = new HashMap();
        tulemused.put("juku", 3);
        tulemused.put("kati", 4);
        System.out.println(tulemused);

    }
}
