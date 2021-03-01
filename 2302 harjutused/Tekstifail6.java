import java.io.*;
import java.net.*;
public class Tekstifail6{
    public static double akeskm(String[] sisend){
        double summa=0;
        for(int i=0; i<sisend.length; i++){
            summa+=Integer.parseInt(sisend[i]);
        }
        return summa/sisend.length;
    }
    public static void main(String argumendid[]) throws IOException{
        BufferedReader sisse=new BufferedReader(
                new InputStreamReader(new URL("http://www.tlu.ee/~jaagup/andmed/muu/pikkused.txt").openStream())
        );
        double k2=akeskm(sisse.readLine().split(" "));
        System.out.println(k2);
        sisse.close();
        PrintWriter pw = new PrintWriter(new FileWriter("vastus6.txt"));
        pw.println("Pikkuste keskmine on " + k2);
        pw.close();
    }
}