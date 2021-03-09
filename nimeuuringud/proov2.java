import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class proov2{
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(arg[0]));
        String rida = br.readLine();
        String lause = "";
        int pikkus = 0;
        while(rida!=null){
            lause += rida + " ";
            rida = br.readLine();
            pikkus++;
        }

        tekstistEraldaja e = new eraldaja();
        System.out.println(e.eralda(lause));

        tekstistEraldaja te = new sonaEraldaja(1);

        System.out.println(te.eralda(lause));

        tekstistEraldaja te2 = new sonaEraldaja(2);
        System.out.println(te2.eralda(lause));

        tekstistEraldaja eP = new sonaEraldaja(pikkus);
        System.out.println(e.eralda(lause) + " " + eP.eralda(lause));


    }
}