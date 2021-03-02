import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class geomKeskmine {

    public static double ruutJuur(double arv1, double arv2){
        return (double)Math.round(Math.sqrt(arv1*arv2) * 10000.0D)/ 10000.0D;
    }

    public static double juurKogumist(List<Double> arvudeKogum){
        int suurus = arvudeKogum.size();
        double korrutis = 1;

        for(int i = 0; i<suurus; i++){
            korrutis = korrutis * arvudeKogum.get(i);
        }

        return (double)Math.round(Math.pow(korrutis, 1.0/suurus) * 10000.0D) / 10000.0D;
    }

    public static List<Double> geoKeskPalk(List<Double> koefPalk){
        int pikkus = koefPalk.size();
        List<Double> geoPalk = new ArrayList<Double>();
        for(int i = 1; i<pikkus; i++){
            geoPalk.add(koefPalk.get(i));
        }
        double geoKoef = juurKogumist(geoPalk);
        geoPalk.add(0, koefPalk.get(0));
        for(int i = 1; i<pikkus; i++){
            geoPalk.set(i, (double)Math.round(geoKoef * geoPalk.get(i-1) * 100.0D) / 100.0D);
        }
        return geoPalk;
    }

    public static List<Double> palgaKalk(List<Double> koefPalk){
        int pikkus = koefPalk.size();
        for(int i = 1; i<pikkus; i++){
            koefPalk.set(i, (double)Math.round(koefPalk.get(i) * koefPalk.get(i-1) * 100.0D) / 100.0D);
        }
        return koefPalk;
    }

    public static List<Double> sisse()throws IOException{
        BufferedReader palkSisse=new BufferedReader(
                new FileReader("palk.txt")
        );
        List<Double> koefPalk = new ArrayList<Double>();
        String rida = palkSisse.readLine();
        while(rida != null){
            koefPalk.add(Double.parseDouble(rida));
            rida = palkSisse.readLine();
        }
        palkSisse.close();

        return koefPalk;
    }



    public static void main(String[] arg) throws IOException{

        // 1.
        System.out.println(Double.parseDouble(arg[0]) + " ja " + Double.parseDouble(arg[1]) + " korrutise ruutjuur on vordne: "
                + ruutJuur(Double.parseDouble(arg[0]), Double.parseDouble(arg[1])));

        // 2.
        List<Double> arvudeKogum = new ArrayList<Double>();
        System.out.println("Sisestage nii mitu arvu kui tahate, et need korrutada ja nendest voetakse juur: (Viimaseks 'arvuks' lisage taht, et lopetada tsukkel)");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextDouble()){
            arvudeKogum.add(scan.nextDouble());
        }
        System.out.println("Vastus: " + juurKogumist(arvudeKogum));

        // 3
        List<Double> koefPalk = sisse();
        List<Double> geoKesk = geoKeskPalk(koefPalk);
        List<Double> koefPalgaKalk = palgaKalk(koefPalk);
        PrintWriter valjund = new PrintWriter(new FileWriter("valjundPalk.txt"));
        int pikkus = geoKesk.size();
        valjund.println("Koef palk------GeoKesk palk");
        for(int i = 0; i<pikkus; i++){
            valjund.println(koefPalgaKalk.get(i) + "---------" + geoKesk.get(i));
        }

        valjund.close();

    }
}
