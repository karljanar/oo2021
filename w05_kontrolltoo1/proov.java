import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class proov {

    public static void main(String[] arg) throws IOException{

        hulknurk kolmn = new hulknurk();
        Integer[] x = {3, 4, 1};
        Integer[] y = {4, 5, 6};
        kolmn.addToArray(x, y);
        System.out.println(kolmn.askArray());
        System.out.println("Umbermoot: " + kolmn.perimeter());




        // Lisa klassile käsklus tekkiva hulknurga graafiliseks kuvamiseks. Loe sisendandmed failist.
        hulknurk nurk = new hulknurk();
        BufferedReader sisse=new BufferedReader(
                new FileReader("arvud2.txt")
        );
        String rida1 = sisse.readLine();
        List<String> xarr = Arrays.asList(rida1.split("  "));
        List<Integer> xInt = new ArrayList<Integer>();
        String rida2 = sisse.readLine();

        for(String s : xarr) xInt.add(Integer.valueOf(s));

        List<String> yarr = Arrays.asList(rida2.split("  "));
        List<Integer> yInt = new ArrayList<Integer>();

        for(String s : yarr) yInt.add(Integer.valueOf(s));
        nurk.addToArray2(xInt, yInt);



        sisse.close();
    }
}