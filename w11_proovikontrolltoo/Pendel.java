import java.util.*;

public class Pendel{
    List<String> tiktak = Arrays.asList("tik", "tak");
    Hammasratas vonkeratas = new Hammasratas();
    Hammasratas siseminevonke = new Hammasratas();
    Hammasratas minutiratas = new Hammasratas();
    Hammasratas siseminut = new Hammasratas();
    Hammasratas tunniratas = new Hammasratas();

    public void pendeliTiksumine(double pikkus) throws InterruptedException {
        double vonkePeriood = 2 * Math.PI * Math.sqrt(pikkus/9.8);
        for(int i = 0; i<120; i++){
            System.out.println(tiktak.get(i % 2));
            System.out.println("Vonkeratas " + vonkeratas.liiguEdasi(120));
            System.out.println(siseminevonke.liiguEdasi(vonkeratas.kysiHambaid() / 20));
            //System.out.println("Vonkeratas " + minutiratas.liiguEdasi(120));
            //System.out.println("ee " + siseminut.liiguEdasi(10));


            Thread.sleep((long)(vonkePeriood * 1000) - 500);
        }
    }


}
