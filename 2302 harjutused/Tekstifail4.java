import java.io.*;
public class Tekstifail4{
    public static void main(String argumendid[]) throws IOException{
        BufferedReader sisse=new BufferedReader(
                new FileReader("arvud1.txt")
        );
        int summa = 0;
        double arvud = 0;
        String rida=sisse.readLine();
        while(rida!=null){
            System.out.println(rida);
            int arv = Integer.parseInt(rida);
            summa += arv;
            arvud += 1;
            rida=sisse.readLine();
        }
        sisse.close();
        System.out.println(summa);
        // aritmeetiline keskmine
        System.out.println(summa/arvud);
    }
}