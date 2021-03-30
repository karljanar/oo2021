package v2;

public class proov3 {
    public static void main(String[] arg){
        luliti l1 = new luliti();
        luliti l2 = new luliti();
        roop r1 = new roop();
        r1.lisa(l1);
        r1.lisa(l2);
        sisend a = new sisend();
        a.lisa(l1);
        sisend b = new sisend();
        b.lisa(l2);
        a.seisund(true);
        b.seisund(false);
        System.out.println(r1.kysiTakistus());
    }
}
