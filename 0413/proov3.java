import java.util.*;

public class proov3 {

    public static <T> Map<T, Integer> sagedustabel(List<T> m){
        Map<T, Integer> vastus = new HashMap<>();
        for (T e:m){
            if(vastus.containsKey(e)){
                vastus.put(e, vastus.get(e)+1);
            } else {
                vastus.put(e, 1);
            }
        }
        return vastus;
    }

    public static void main(String[] arg){
        paar<String, String> p1 = new paar<>("juku", "kati");
        paar<String, String> p2 = new paar<>("juku", "kati");
        System.out.println(p1.equals(p2));
        List<paar<String,String>> paarid = new ArrayList<>();
        paarid.add(new paar<>("juku", "kati"));
        paarid.add(new paar<>("juku", "kati"));
        paarid.add(new paar<>("mati", "kati"));
        System.out.println(sagedustabel(paarid));

    }
}
