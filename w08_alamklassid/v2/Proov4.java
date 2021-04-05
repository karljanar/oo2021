package v2;

public class Proov4 {
    public static void main(String[] arg){
        /*
        takisti t1 = new takisti(300, 5);
        takisti t2 = new takisti(500, 5);

        jada j1 = new jada();
        j1.lisa(t1);
        j1.lisa(t2);

        System.out.println(j1.kysiTakistus());
        System.out.println(j1.kysiMaxPinge());
        System.out.println(j1.kysiMaxVoimsus());*/

        takisti t3 = new takisti(300, 5);
        takisti t4 = new takisti(500, 5);
        takisti t5 = new takisti(500, 5);
        takisti t6 = new takisti(500, 5);

        roopjada rj1 = new roopjada();
        rj1.lisa("s1", t3);
        rj1.lisa("s2", t4);
        rj1.lisa("p1", t5);
        rj1.lisa("p2", t6);

        System.out.println(rj1.kysiTakistus());
        System.out.println(rj1.kysiMaxPinge());
        System.out.println(rj1.kysiMaxVoimsus());



    }
}
