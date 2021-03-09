import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class proov4 {
    public static void main(String[] arg) throws IOException {
        hoidla h = new talletavHoidla(5);
        BufferedReader br = new BufferedReader(new FileReader(arg[0]));
        String rida = br.readLine();
        while(rida!=null){
            h.lisa(Integer.parseInt(rida));
            rida = br.readLine();
        }
        System.out.println(h.kysiSumma());


    }
}
