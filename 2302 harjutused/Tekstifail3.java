import java.io.*;
public class Tekstifail3{
    public static void main(String argumendid[]) throws IOException{
        BufferedReader sisse=new BufferedReader(
                new FileReader("inimesed.txt")
        );
        String rida=sisse.readLine();
        while(rida!=null){
            System.out.println(rida);
            rida=sisse.readLine();
        }
        sisse.close();
    }
}