import java.util.*;

public class JavaMathExample1
{
    public static void main(String[] args)
    {
        Hashtable <String, Integer> naide = new Hashtable<>();
        naide.put("muki", 3);
        naide.put("koeranimedlaksmeelest", 6);
        System.out.println(naide);
        System.out.println(naide.size());


        double x = 28;
        double y = 4;


        System.out.println("max x ja y vahel " +Math.max(x, y));

        System.out.println("Ruutjuur y " + Math.sqrt(y));

        System.out.println("x astmes y " + Math.pow(x, y));

        System.out.println("log10 x : " + Math.log10(x));
        System.out.println("log10 y : " + Math.log10(y));

    }
}