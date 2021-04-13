package komplekt;

public class proov1 {
    public static void main(String[] arg){
        /*ruuduarvutaja r= new ruuduarvutaja();
        System.out.println(r.arvuta(5));
   */

        /*puhver<Integer, Integer> p1 = new puhver<>(new ruuduarvutaja());
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));*/

        puhver<String, String> p1 = new puhver<>(new tekstiruut());
        System.out.println(p1.arvuta("Kolm"));
        System.out.println(p1.arvuta("auto"));
        System.out.println(p1.arvuta("Kolm"));
    }
}
