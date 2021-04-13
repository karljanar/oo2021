import java.util.HashMap;
import java.util.Map;
//import javafx.util.*;

public class proov2 {
    public static <T> void tryki(T[] m){
        for(int i = 0; i<m.length; i++){
            T a = m[i];
            System.out.println(a);
        }
    }

    public static <S> void poora(S[] m){
        for(int i = (m.length - 1); i>=0; i--){
            S d = m[i];
            System.out.println(d);
        }
    }

    public static <T> void pooraev(T[] m) {
        T f = m[0];
        m[0] = m[m.length - 1];
        m[m.length - 1] = f;
        tryki(m);
    }


    public static <T> Map<T, Integer> sagedustabel(T[] m){
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

    public static Character[] teisenda(char[] m){
        Character[] vastus = new Character[m.length];
        for (int i =0; i<m.length; i++){
            vastus[i] = m[i];
        }
        return vastus;
    }

    public static void main(String[] arg){
        //tryki(arg);
       /* tryki(new Integer[]{3, 21, 44});
        poora(new Integer[]{3, 21, 44});
        pooraev(new String[]{"ab", "cd", "ef"});*/
        System.out.println(sagedustabel(arg));
        System.out.println(sagedustabel("tere".split("")));
        System.out.println(sagedustabel(teisenda("tere".toCharArray())));
        System.out.println(sagedustabel(new String[][]{{"t", "e"},{"e", "r"}}));


    }
}
