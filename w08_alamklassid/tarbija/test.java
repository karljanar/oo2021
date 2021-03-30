package tarbija;

public class test {
    public static void main(String[] arg){
        tarbija test1 = new tarbija(488, 118);
        System.out.println(test1.kysiVool(220) + "A");
        System.out.println(test1.kysiMaxPinge());
        System.out.println(test1.kasLubatudPinge(200));
        System.out.println(test1.kasLubatudVool(0.3));
        tarbija test2 = new tarbija(488, 118);
    }
}
