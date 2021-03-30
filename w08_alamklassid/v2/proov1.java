package v2;

public class proov1 {
    public static void main(String[] arg){
        takisti t1 = new takisti(1000, 5);
        takisti t2 = new takisti(1000, 5);
        /*System.out.println(t1.kysiVool(3.3));
        System.out.println(t1.kysiMaxPinge());
        System.out.println(t1.kasLubatudPinge(30));
        System.out.println(t1.kasLubatudPinge(300));
        */
        roop r1 = new roop();
        r1.lisa(t1);
        r1.lisa(t2);
        takisti t3 = new takisti(1, 40);
        r1.lisa(t3);
        System.out.println(r1.kysiTakistus());
        System.out.println(r1.kysiMaxPinge());
        System.out.println(r1.kysiMaxVoimsus());


    }
}
